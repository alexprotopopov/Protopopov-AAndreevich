package ru.job4j.calculator;
/**
*Calculate.
*@author alex protopopov
*@since 18.03.2018
*@version $Id$
*/
public class Calculator {
	private double result;

	public void add1(double first, double second) {
		this.result = first + second;
	}
	public void add2 (double first, double second) {
            this.result = first - second;
        }
        public void add3 (double first, double second) {
        this.result = first * second;
        }
        public void add4 (double first, double second) {
        this.result = first / second;
         }
        public double getResult() {
            return this.result;
        }
    }


