package ex07concurrency.web;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.xml.ws.Endpoint;
//Manual import in Eclipse - it deems this package to be unsafe and gives an Access Restriction
import com.sun.net.httpserver.*;

public class HelloStopper {
	
	@SuppressWarnings("restriction")
	HelloStopper(final int port, final Endpoint endpoint) throws IOException {
		
		final HttpServer server = HttpServer.create(new InetSocketAddress(port), 5);
		final ExecutorService threads = Executors.newFixedThreadPool(2);
		server.setExecutor(threads);
		server.start();
		
		//communicate with your "container"
		HttpContext context = server.createContext("/stop");
		//now we'll override how the context handles a method
		context.setHandler(new HttpHandler() {
			@Override
			public void handle(HttpExchange msg) throws IOException {
				System.out.println("Shutting down endpoint");
				endpoint.stop();
				System.out.println("Endpoint stopped");
				msg.sendResponseHeaders(200, 0); //that's HTTP 200 and exit code 0
				msg.close();
				server.stop(1);
				threads.shutdown();
			}
		});
	}

}
