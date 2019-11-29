package ex07concurrency;

import java.util.*;
import java.io.*;

public class Factory {

    protected LinkedList<Object> list = new LinkedList<>();
    protected static int MAX = 5;
    protected boolean done = false;

    Factory(int nP, int nC) {
        for (int i=0; i<nP; i++)
            new Producer().start();
        for (int i=0; i<nC; i++)
            new Consumer().start();
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        int numProducers = 1;
        int numConsumers = 1;
        Factory f = new Factory(numProducers, numConsumers);
        Thread.sleep(20000);
        synchronized(f.list) {
            f.done = true;
            f.list.notifyAll();
        }
    }

    class Producer extends Thread {
        public void run() {
            while (!done) {
                Object justProduced = new Object();
                synchronized(list) {
                    while (list.size() == MAX) // the queue is full
                    try {
                        System.out.println("Producer WAITING");
                            list.wait();
                        } catch (InterruptedException ex) {
                            System.out.println("Producer INTERRUPTED");
                        }
                    list.addFirst(justProduced);
                    list.notifyAll();    // must own the lock
                    System.out.println("Produced 1; List size now " + list.size());
                }
            }
        }
    }

    class Consumer extends Thread {
        public void run() {
            while (!done) {
                Object obj = null;
                synchronized(list) {
                    while (list.size() == 0) {
                        try {
                            System.out.println("CONSUMER WAITING");
                            list.wait();    // must own the lock
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
    }
}
