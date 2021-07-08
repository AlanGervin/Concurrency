package org.perscholas.concurrency.AlanGervin;

public class ConcurrencyEx2 implements Runnable {
	private static int a = 0;
	
	public ConcurrencyEx2() {}
	
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			ConcurrencyEx2.increase();
			ConcurrencyEx2.getCount();
			
		}
	}
	
	
	public static void main(String[] args) {		
		Thread t1 = new Thread(new ConcurrencyEx2());
		Thread t2 = new Thread(new ConcurrencyEx2());
		t1.start();
		t2.start();
		System.out.println(a);
	}
	
	public static synchronized void increase() {
		a++;
	}
	
	public static void getCount() {
		System.out.println(a);
	}
	
	


}
