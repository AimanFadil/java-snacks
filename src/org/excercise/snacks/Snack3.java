package org.excercise.snacks;


import java.util.Arrays;

public class Snack3 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int somma = 0;

        for (int i = 0; i < n.length; i++) {
            if (i % 2 != 0) {
                somma += n[i];

            }
        }
        System.out.println(somma);
    }
}