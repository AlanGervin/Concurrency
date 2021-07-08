package org.perscholas.concurrency.AlanGervin;

public class NumberCounter implements Runnable {

	public static int a = 0;
	
	@Override
	public void run() {		
		synchronized (this) {
			for (int i = 0; i < 100000; i++) {
				//System.out.println(i);
				NumberCounter.increment();
			}
			notify();
		}
	}
	
	public static void increment() {
		a++;
	}
	
	public static int getInt() {
		return a;
	}
}
