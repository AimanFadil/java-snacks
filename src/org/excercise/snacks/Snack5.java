package org.excercise.snacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una frase (anche numeri e simboli) o 0 per chiudere: ");
        String stringa = scanner.nextLine();

        if (stringa.equals("0")) {
            System.out.println("fine");
        }
        else{
            int lettere = 0;
            int numeri = 0;
            int altro = 0;

            for (char alfa : stringa.toCharArray()) {
                if (Character.isLetter(alfa)) {
                    lettere++;
                } else if (Character.isDigit(alfa)) {
                    numeri++;
                } else {
                    altro++;
                }
            }

            System.out.println("lettere: " + lettere);
            System.out.println("numeri: " + numeri);
            System.out.println("altri caratteri: " + altro);
        }


    }
}
