package com.company;

public class Exercise1 {

    public static void runExercise1() {
        Integer pizzaAmount;
        Double maxRatio = 0.0;
        Integer bestValue = 0;

        pizzaAmount = Utilities.getKeyboardInputInt("Podaj liczbę pizz: ");
        Double[] result = new Double[pizzaAmount];
        Integer[] diameter = new Integer[pizzaAmount];
        Integer[] price = new Integer[pizzaAmount];

        for (int i = 0; i < result.length; i++) {
            diameter[i] = Utilities.getKeyboardInputInt("Podaj średnicę pizzy nr " + (i+1) + " w cm: ");
            price[i] = Utilities.getKeyboardInputInt("Podaj cenę pizzy nr " + (i+1) + " w zł: ");
            result[i] = (Math.PI * (diameter[i] / 2) * (diameter[i] / 2)) / price[i];;
        }
        System.out.println();

        for (int i = 0; i < result.length; i++) {
            System.out.println("Współczynnik opłacalności pizzy nr " + (i + 1) + " o średnicy " +  diameter[i] + " i cenie " + price[i] + " zł (w cm2) wynosi: " + result[i]);
            if (result[i] > maxRatio) {
                maxRatio = result[i];
                bestValue = i;
            }
        }

        Utilities.displayText("Najbardziej opłaca się kupić pizzę nr " + (bestValue + 1) + ".");
        Utilities.displayMenuBack();
    }
}
