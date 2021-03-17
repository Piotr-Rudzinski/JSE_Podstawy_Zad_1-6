package com.company;

public class Exercise5 {

    public static void runExercise5() {
        Integer[] input;

        input = new Integer[Utilities.getKeyboardInputInt("Podaj liczbę elementów tablicy: ")];
        input = fillArray(input);
        displayArray(input);
        Utilities.displayText("Sortowanie ...");
        displayArray(sort(input));
        Utilities.displayMenuBack();
    }

    public static Integer[] fillArray(Integer[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = Utilities.getKeyboardInputInt("Podaj element nr " + (i + 1) + " tablicy: ");;
        }
        return input;
    }

    public static void displayArray(Integer[] input) {
        System.out.print("[");
        for (int i = 0; i< input.length; i++) {
            System.out.print(input[i]);

            if (i < (input.length -1 )) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static Integer[] sort(Integer[] input) {
        Boolean flag = false;
        Integer numberL;
        Integer numberR;

        do {
            flag = false;
            for (int i = 0; i < (input.length - 1); i++) {
                numberL = input[i];
                numberR = input[i + 1];

                if (numberR < numberL) {
                    input[i] = numberR;
                    input[i + 1] = numberL;
                    flag = true;
                }
            }
        }
        while (flag);
        return input;
    }
}
