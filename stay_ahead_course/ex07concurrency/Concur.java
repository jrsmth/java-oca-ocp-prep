package ex07concurrency;

import java.util.Map;
import java.util.HashMap;
import java.time.LocalDateTime;

public class Concur {
	public static void main(String[] args) {
		Map<LocalDateTime, String> callData = new HashMap<LocalDateTime, String>();
		callData.put(LocalDateTime.now(), "Incoming");
		callData.put(LocalDateTime.now(), "Outgoing");
		for (LocalDateTime key : callData.keySet()) {
			callData.remove(key);
		}
	}
}
