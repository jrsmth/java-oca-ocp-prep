package ex07concurrency.web;

import java.io.IOException;

import javax.xml.ws.Endpoint;

public class HelloPublisher {
	
	public static void main(String[] args) {
		
		final String url = "http://localhost:9999/helloService";
		System.out.println("Publishing class Hello at endpoint: " + url);
		
		//Version 1 code to establish endpoint
		//Endpoint.publish(url, new Hello());
		//Normally an interface (SEI or Service Endpoint Interface)
		//This is a SIB - Service Implementation Bean
		
		//Version 2 code to establish endpoint
		Endpoint endpoint = Endpoint.publish(url, new Hello());
		
		//Version 2 code to stop this service with another service
		//The stopper is built with this service, so it will stop with it.
		try {
			new HelloStopper(9998, endpoint);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
