package org.perscholas.concurrency.AlanGervin;



public class ConcurrencyEx1 implements Runnable {

	public synchronized void run() {
		System.out.println("Hello world");
	}
	
	public ConcurrencyEx1() {
		
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new NewThread(), "t1");
		Thread t2 = new Thread(new NewThread(), "t2");
		Thread t3 = new Thread(new NewThread(), "t3");
		Thread t4 = new Thread(new NewThread(), "t4");
		Thread t5 = new Thread(new NewThread(), "t5");
		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
			t4.start();
			t4.join();
			t5.start();
			t5.join();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
