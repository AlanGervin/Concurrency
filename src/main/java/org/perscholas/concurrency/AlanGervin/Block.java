package org.perscholas.concurrency.AlanGervin;

public class Block {
	private boolean countDone = true;
	
	public synchronized void count() {	
		while (!countDone) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		countDone = false;
		notifyAll();
	}
	
	public synchronized void print() {
		System.out.println(NumberCounter.getInt());
		while (countDone) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		countDone = true;
		notifyAll();
	}
}
