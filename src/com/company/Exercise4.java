package com.company;

import java.util.Scanner;

public class Exercise4 {

    public static void runExercise4() {
        Integer nameMaxPosition = 0;
        Integer nameMaxDl = 0;
        Integer nameMinPosition = 0;
        Integer nameMinDl = 1000;
        String allNameString = "";

        System.out.println("");
        Integer number = Utilities.getKeyboardInputInt("Podaj liczbę imion: ");
        String[] table = new String[number];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < number; i++) {
            System.out.print("Podaj imię: ");
            String strIn = scanner.nextLine();
            strIn = strIn.toUpperCase();
            strIn = "*" + strIn + "*";
            table[i] = strIn;

            if ((strIn.length() -2) > nameMaxDl) {
                nameMaxDl = (strIn.length() - 2);
                nameMaxPosition = i;
            }

            if ((strIn.length() -2) < nameMinDl) {
                nameMinDl = (strIn.length() -2);
                nameMinPosition = i;
            }
            allNameString = allNameString + strIn;
        }

        String newString = table[nameMaxPosition];
        newString = newString.replace("*", "");
        System.out.println("Najdłuższe imię: " + newString);

        newString = table[nameMinPosition];
        newString = newString.replace("*", "");
        System.out.println("Najkrótsze imię: " + newString);

        System.out.println(identifiedDuplicatedNames(table, allNameString));
        Utilities.displayMenuBack();
    }

    public static StringBuilder identifiedDuplicatedNames(String[] table, String allNameString)  {
        StringBuilder stringBuilder = new StringBuilder("Powtarzające się imiona: ");
        String newString;
        Integer initialLength = 0;
        Integer finalLength = 0;
        Integer repetitionNumber = 0;

        for (int i = 0; i < table.length; i++) {
            newString = table[i];
            initialLength = allNameString.length();
            allNameString = allNameString.replace(newString, "");
            finalLength = allNameString.length();
            repetitionNumber = (initialLength - finalLength) / newString.length();
            newString = newString.replace("*", "");
            if (repetitionNumber > 1) {
                stringBuilder.append(newString + " (");
                stringBuilder.append(repetitionNumber);
                stringBuilder.append("), ");
            }
        }
        return stringBuilder;
    }
}
