package com.gmail.s12348.evgen;

import java.math.BigInteger;

public class FactorialNumber implements Runnable {
	private int number;

	public FactorialNumber() {
	}

	public FactorialNumber(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private BigInteger calculateFactorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = n; i > 1; i -= 1) {
			fact = fact.multiply(new BigInteger(Integer.toString(i)));
		}
		return fact;
	}

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		// for (int i = 0; i < this.number; i++) {

		System.out.println(th.getName() + "\t" + this.number + "! =" + calculateFactorial(this.number));
		// }
	}

}
