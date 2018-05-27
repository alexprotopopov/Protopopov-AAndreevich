package ru.job4j.fit;
/**
 * Программа расчета идеального веса.
 */
public class Fit {
    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        double idealweight = (height - 100) * 1.15;
        return (height - 100) * 1.15;
    }
    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        double idealweight = (height - 110) * 1.15;
        return (height - 110) * 1.15;
    }
}