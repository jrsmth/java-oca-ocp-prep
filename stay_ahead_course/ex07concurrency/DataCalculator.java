package ex07concurrency;

import java.util.*;

public class DataCalculator {
	public int processRecord(int input) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// Handle interrupted exception
		}
		return input + 1;
	}

	public void processAllData(List<Integer> data) {
		//data.stream().map(a -> processRecord(a)).count();
		data.parallelStream().map(a -> processRecord(a)).count();
	}

	public static void main(String[] args) {
		DataCalculator calculator = new DataCalculator();
		// Define the data
		List<Integer> data = new ArrayList<Integer>(); 
		for(int i=0; i<4000; i++){
				data.add(i); // Process the data
		}
		long start = System.currentTimeMillis(); calculator.processAllData(data);
		double time = (System.currentTimeMillis()-start)/1000.0;
		// Report results
		System.out.println("\nTasks completed in: "+time+" seconds"); 
	}
}