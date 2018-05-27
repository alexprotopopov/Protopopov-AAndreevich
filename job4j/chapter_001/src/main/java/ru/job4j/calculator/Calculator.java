package ru.job4j.calculator;
/**
*Calculate.
*@author alex protopopov
*@since 18.03.2018
*@version $Id$
*/
public class Calculator {
	private double result;

	public void addition (double first, double second) {
		this.result = first + second;
	}

	public void subtraction(double first, double second) {
            this.result = first - second;
        }

        public void multiplication(double first, double second) {
        this.result = first * second;
        }

        public void division(double first, double second) {
        this.result = first / second;
         }

         public double getResult() {
            return this.result;
        }
    }


