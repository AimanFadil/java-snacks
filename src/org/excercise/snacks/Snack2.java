package org.excercise.snacks;

import java.util.Arrays;

public class Snack2 {
    public static void main(String[] args) {
        String[] nomi = {"Alessio", "Luca", "Aldo", "Giovanni", "Claudio"};
        String[] cognomi = {"Luchetti", "Orsolini", "Chiellini", "Lorenzini", "Becheri"};


        String[] nomiCognomi = new String[nomi.length];

        for (int i = 0; i < nomi.length; i++) {
            nomiCognomi[i] = nomi[i] + " " + cognomi[i];
        }

        System.out.println(Arrays.toString(nomiCognomi));
    }
}