package ru.job4j.converter;
/**
 * Корвертор валюты.
 */
public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        int result = value / 70;
        return value / 70;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        int result = value / 60;
        return value / 60;
    }
    /**
     * Конвертируем евро в рубли.
     * @param valueeuro евро.
     * @return Рубли.
     */
    public int euroToRuble(int valueeuro) {
        int result = valueeuro * 70;
        return  valueeuro * 70;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param valuedollar доллары.
     * @return Рубли.
     */
        public int dollarToRuble(int valuedollar) {
            int result = valuedollar * 60;
            return valuedollar * 60;
        }
    }





