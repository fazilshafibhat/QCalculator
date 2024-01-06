package com.self_learning.q_calculator;

public class StandardCalculator {
    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }

    protected double result;

    // Arithmatic oprts
    public final void add(int num1, int num2) {
        result = num1 + num2;
        System.out.println("inside normal methods");
        printResult();
    }

    public final void subtract(int num1, int num2) {
        result = num1 - num2;
        printResult();
    }

    public void multiply(int num1, int num2) {
        result = num1 * num2;
        printResult();
    }

    public final void divide(int num1, int num2) {
        result = num1 / num2;
        printResult();
    }

    // getters function
    public double getResult() {
        return result;
    }

    // Set result to 0
    public void setResult(int value) {
        if (value != 0)
            return;
        this.result = value;
    }

    // Clear result
    public void clearResult() {
        result = 0;
    }

    // Print result
    public void printResult() {
        System.out.println("Standard Calculator Result:" + result);
    }

    // Overeload methods
    public final void add(double num1, double num2) throws ArithmeticException {
        result = num1 + num2;
        System.out.println("inside overloaded methods");
        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {
            throw new ArithmeticException("Double Overflow");
        } else {
            printResult();
        }
    }

    // Overeload methods
    public final void subtract(double num1, double num2) throws ArithmeticException {
        result = num1 - num2;
        System.out.println("inside overloaded methods");
        if ((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)) {
            throw new ArithmeticException("Double Overflow");
        } else {
            printResult();
        }
    }

    public void multiply(double num1, double num2) throws ArithmeticException {
        result = num1 * num2;
        System.out.println("inside overloaded methods");
        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)
                || (result == Double.NEGATIVE_INFINITY)) {
            throw new ArithmeticException("Double Overflow");
        } else {
            printResult();
        }
    }

    public final void divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0.0) {
            throw new ArithmeticException("Divide By Zero");
        }
        result = num1 / num2;
        printResult();
    }

}
