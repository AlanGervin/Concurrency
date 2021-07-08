package org.perscholas.concurrency.AlanGervin;

public class ConcurrencyEx3 {

	
	public static void main(String[] args) {    
		Block block = new Block();
		(new Thread(new NumberPrinter(block))).start();
		(new Thread(new NumberCounter(block))).start();
	}

}
