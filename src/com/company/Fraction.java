package com.company;

public class Fraction {
    private int counter;
    private int denominator;
    private double value;

    public Fraction (int counter, int denominator) {
        this.counter = counter;
        this.denominator = denominator;
    }

    public Fraction () {
        counter = 0;
        denominator = 1;
    }

    public void displayValue () {
        value = (double) counter / denominator;
        System.out.println(value + " [" + counter + "/" + denominator + "]");
    }
}
