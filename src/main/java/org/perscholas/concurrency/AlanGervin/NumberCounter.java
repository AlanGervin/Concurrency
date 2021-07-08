package org.perscholas.concurrency.AlanGervin;

public class NumberCounter implements Runnable {
	private Block block;
	public static int a = 0;
	
	public NumberCounter(Block block) {
		this.block = block;
	}

	@Override
	public void run() {		
		synchronized (block) {
			for (int i = 0; i < 100000; i++) {
				//System.out.println(i);
				increment();
			}
			block.count();
		}
	}
	
	public static void increment() {
		a++;
	}
	
	public static int getInt() {
		return a;
	}

	

	
}
