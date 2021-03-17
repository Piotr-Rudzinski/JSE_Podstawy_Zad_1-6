package com.company;

import java.util.Scanner;

public class Exercise6 {

    public static void runExercise6() {
        String imie = "";
        do {
            System.out.print("Podaj imię (q + Enter kończy program): ");
            Scanner scanner = new Scanner(System.in);
            imie = scanner.nextLine();
            System.out.println(Utilities.isEven(imie));
        }
        while ((imie.length() != 1) && (imie != "q"));

        System.out.println();
    }
}
