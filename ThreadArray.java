package com.gmail.s12348.evgen;

public class ThreadArray {

	public static void threadArray() {
		Thread[] thArray = new Thread[100];
		for (int i = 0; i < thArray.length; i++) {
			thArray[i] = new Thread(new FactorialNumber(i));
			thArray[i].start();
		}
	}

}
