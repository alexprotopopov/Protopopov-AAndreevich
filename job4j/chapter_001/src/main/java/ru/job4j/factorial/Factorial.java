package ru.job4j.factorial;

public class Factorial {
	public int calc(int n) {
		int result = 1;
		for (int index = 1; index <= n; index++) {
			result = index * result;
		}
		return result;
	}
}