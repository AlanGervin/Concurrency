package org.perscholas.concurrency.AlanGervin;

class ConcurrencyEx3 {
	
	public static void main(String[] args) {

		Thread numberCounter = new Thread(new NumberCounter());
		
		class ThreadB extends Thread {
			@Override
			public void run() {
				synchronized(numberCounter) {
					try {
						numberCounter.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Total is: " + NumberCounter.getInt());
				}
			}
		}
		
		Thread numberPrinter = new Thread(new ThreadB());
		numberCounter.start();
		numberPrinter.start();
		
	}

}