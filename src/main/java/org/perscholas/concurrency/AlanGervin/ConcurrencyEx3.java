package org.perscholas.concurrency.AlanGervin;

class ConcurrencyEx3 {
	
	public static void main(String[] args) {
		Thread nc = new Thread(new NumberCounter());
		nc.start();
		
		synchronized(nc) {
			try {
				nc.wait();
			} catch(InterruptedException e) {}
			System.out.println("Total is: " + NumberCounter.getInt());
		}
	}

}