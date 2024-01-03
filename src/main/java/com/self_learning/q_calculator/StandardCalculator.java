package com.self_learning.q_calculator;

public class StandardCalculator {
    private int result;

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }

    public void add(int num1, int num2) {

        result = num1 + num2;
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

}
