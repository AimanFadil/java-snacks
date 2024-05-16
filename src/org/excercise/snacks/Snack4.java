package org.excercise.snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Scrivi una parola:");
        String parola = scanner.nextLine();

        boolean palindroma = true;

        int nParola = parola.length();

        for (int i = 0; i < nParola / 2; i++) {
            if (parola.charAt(i) != parola.charAt(nParola - i - 1)) {
                palindroma = false;

            }
        }
        System.out.println(palindroma ? "Palindroma" : "Non Palindroma");


    }
}
