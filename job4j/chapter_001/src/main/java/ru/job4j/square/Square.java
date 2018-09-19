package ru.job4j.square;

public class Square {
    public static int[] calculate(int bound) {

        int[] rst = new int[bound];
        /**заполнить массив через цикл элементами от 1 до bound возведенными в квадрат */
		for (int i = 0; i < bound; i++) {
		    if (i==0) rst[i] = (i+1)*(i+1); else
		    rst[i] = (i+1)*(i+1);
		}
        return rst;
    }

}


