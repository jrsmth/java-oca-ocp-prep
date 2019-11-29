package ex07concurrency;

import java.util.*;
import java.io.*;

public class Factory2 {

	protected LinkedList<Object> list = new LinkedList<>();
	protected static int MAX = 5;
	protected boolean done = false;

	Factory2(int nP, int nC) {
		for (int i = 0; i < nP; i++)
			new Thread(() -> producer()).start();
		for (int i = 0; i < nC; i++)
			new Thread(() -> consumer()).start();
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		int numProducers = 1;
		int numConsumers = 1;
		Factory f = new Factory(numProducers, numConsumers);
		Thread.sleep(10000);
		synchronized (f.list) {
			f.done = true;
			f.list.notifyAll();
		}
	}

	private synchronized void producer() {
		while (!done) {
			Object justProduced = new Object();
			while (list.size() == MAX) // the queue is full
				try {
					System.out.println("Producer WAITING");
					list.wait();
				} catch (InterruptedException ex) {
					System.out.println("Producer INTERRUPTED");
				}
			list.addFirst(justProduced);
			list.notifyAll(); // must own the lock
			System.out.println("Produced 1; List size now " + list.size());
		}
	}

	private synchronized void consumer() {
		while (!done) {
			Object obj = null;
			while (list.size() == 0) {
				try {
					System.out.println("CONSUMER WAITING");
					list.wait(); // must own the lock
				} catch (InterruptedException ex) {
					System.out.println("CONSUMER INTERRUPTED");
				}
			}
			obj = list.removeLast();
			list.notifyAll();
			System.out.println("Consumed 1; List size now " + list.size());
		}
	}
}
