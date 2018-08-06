package ru.job4j.counter;

public class Counter {
	private int result;
	public int add(int start, int finish) {
		for (int index = start; index <= finish; index++) {
			if (index % 2 == 0) {
				result = result + index;
			}
		}
		return result;
	}
}

