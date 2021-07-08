package org.perscholas.concurrency.AlanGervin;

class NumberPrinter implements Runnable {
	private Block block;
	
	public NumberPrinter(Block block) {
		this.block = block;
	}
	@Override
	public void run() {

		try {
			Thread.sleep(1);
			block.print();	
		} catch (InterruptedException e) {}

	}
	
}