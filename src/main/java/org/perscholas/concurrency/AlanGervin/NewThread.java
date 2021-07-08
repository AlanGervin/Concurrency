package org.perscholas.concurrency.AlanGervin;

public class NewThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello world " + Thread.currentThread().getId());
		
	}

}
