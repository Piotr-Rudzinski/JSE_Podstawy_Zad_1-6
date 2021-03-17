package com.company;

import java.util.Scanner;

public class Utilities {

    public static Integer getKeyboardInputInt (String text) {
        boolean flag = false;
        Integer number = 0;

        while (!flag) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(text);
                number = scanner.nextInt();

                if (number > 0) {
                    flag = true;
                    //diameterArray[i] = number;
                }
            } catch (Exception e) {
                System.out.println("Podaj dodatnią liczbę całkowitą.");
            }
        }
        return number;
    }

    public static boolean isEven(String imie) {
        return !((imie.length() % 2) > 0);
    }

    public static void displayText(String string) {
        System.out.println();
        System.out.println(string);
        System.out.println();
    }

    public static void displayMenuBack() {
        System.out.println();
        Utilities.getKeyboardInputInt("Naciśnij dowolną cyfrę aby powrócic do menu.");
        System.out.println();
    }
}
