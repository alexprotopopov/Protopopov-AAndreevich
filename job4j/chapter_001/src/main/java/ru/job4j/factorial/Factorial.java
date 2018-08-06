package ru.job4j.factorial;

public class Factorial {
	private int result;
	public int calc(int n) {

		for (int index=1; index <= n; index++){
		result = index*result;}
				if (n == 0) {
			result=1;
		}
		return result;
	}
	}


