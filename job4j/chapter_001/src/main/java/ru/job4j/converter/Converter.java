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
               return value / 70;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
                return value / 60;
    }
    /**
     * Конвертируем евро в рубли.
     * @param valueeuro евро.
     * @return Рубли.
     */
    public int euroToRuble(int valueeuro) {
               return  valueeuro * 70;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param valuedollar доллары.
     * @return Рубли.
     */
        public int dollarToRuble(int valuedollar) {
                       return valuedollar * 60;
        }
    }





