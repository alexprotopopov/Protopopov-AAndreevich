package ru.job4j.square;
/**
 * заполнить массив через цикл элементами от 1 до bound возведенными в квадрат тут описание
 * @param bound  параметры
 * @return возвращаемое
 */
public class Square {
    public static int[] calculate(int bound) {

        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1);
       		}
        return rst;
    }

}


