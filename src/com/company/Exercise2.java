package com.company;

import java.util.Scanner;

public class Exercise2 {

    public static void runExercise2() {
        System.out.print("Podaj dowolny ciąg znaków. Program policzy liczbę kropek: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        Integer initialLength = inputString.length();
        inputString = inputString.replace(".", "");
        Integer finalLength = inputString.length();

        System.out.println();
        System.out.println("Podany łańcuch zawiera " + (initialLength - finalLength) + " krop(e)k(i).");
        Utilities.getKeyboardInputInt("Naciśnij dowolną cyfrę aby powrócic do menu.");
    }
}
