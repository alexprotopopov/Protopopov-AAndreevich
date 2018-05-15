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
    public int RubleToEuro(int value) {
        int result=value/70;
        return -1;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int RubleToDollar(int value) {
        int result=value/60;
        return -1;
    }
    /**
     * Конвертируем евро в рубли.
     * @param valueeuro евро.
     * @return Рубли.
     */
    public int EuroToRuble(int valueeuro) {
        int result= valueeuro*70;
        return -1;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param valuedollar доллары.
     * @return Рубли.
     */
        public int DollarToRuble(int valuedollar) {
            int result= valuedollar*60;
            return -1;
        }
    }





