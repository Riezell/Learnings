package com.project;

public class EqualityPrinterMain {

	public static void main(String[] args) {
		
		EqualityPrinter printer = new EqualityPrinter();
		
		printer.printEqual(1, 1, 1);
		printer.printEqual(1, 1, 2);
		printer.printEqual(-1, -1, -1);
		printer.printEqual(1, 2, 3);
	}

}
