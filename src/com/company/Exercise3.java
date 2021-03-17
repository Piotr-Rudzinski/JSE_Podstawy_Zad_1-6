package com.company;

public class Exercise3 {

    public  static void runExercise3() {
        int counter;
        int denominator;
        final int objectAmount = 10;
        Fraction[] fraction = new Fraction[objectAmount];

        for (int i = 0; i < objectAmount; i++) {
            fraction[i] = new Fraction(((int) (Math.random() * 100) + 1), ((int) (Math.random() * 100) + 1));
            fraction[i].displayValue();
        }
        Utilities.displayMenuBack();
    }
}
