package com.company;

public class Main {

    public static void main(String[] args) {
        Integer choice = 0;
        boolean flag = false;
        boolean exitFlag = false;

        do {
            while (!flag) {
                printMenu();
                choice = Utilities.getKeyboardInputInt("Twój wybór: ");
                flag = isSelectedOptionOK(choice);
            }

            if (choice != 7) {
                System.out.println("Wybrałeś zadanie nr: " + choice);
                System.out.println();
                selectExercise(choice);
                flag = false;
            } else {
                exitFlag = true;
                System.out.println("Koniec programu.");
            }
        } while (!exitFlag);
    }

    private static void selectExercise(Integer choice) {
        switch (choice) {
            case 1:
                Exercise1.runExercise1();
                break;
            case 2:
                Exercise2.runExercise2();
                break;
            case 3:
                Exercise3.runExercise3();
                break;
            case 4:
                Exercise4.runExercise4();
                break;
            case 5:
                Exercise5.runExercise5();
                break;
            case 6:
                Exercise6.runExercise6();
                break;
            default:
                break;
        }
    }

    public static void printMenu() {
        System.out.println("Wybierz zadanie podając jego numer lub 7, aby zakończyć działanie programu:");
        System.out.println("Zadanie nr 1 - \"Pizza\"");
        System.out.println("Zadanie nr 2 - \"Licz kropki\"");
        System.out.println("Zadanie nr 3 - \"Frakcje\"");
        System.out.println("Zadanie nr 4 - \"Imiona\"");
        System.out.println("Zadanie nr 5 - \"Sortowanie bąbelkowe\"");
        System.out.println("Zadanie nr 6 - \"Liczba liter\"");
        System.out.println("Wyjście (7)");
        System.out.println();
    }

    public static boolean isSelectedOptionOK(Integer choice) {
        boolean flag = false;

        if ((choice > 0) && (choice < 8)) {
            flag = true;
        } else {
            System.out.println("Podaj liczbę od 1 do 6.");
            System.out.println();
        }
        return flag;
    }
}
