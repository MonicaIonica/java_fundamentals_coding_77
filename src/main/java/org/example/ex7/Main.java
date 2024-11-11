package org.example.ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Textul: ");
        String text = input.nextLine();

        char[] vocale = {'a', 'e', 'i', 'o', 'u'};
        int contor = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vocale.length; j++) {
                if (text.charAt(i) == vocale[j]) {
                    contor++;
                }
            }
        }
        System.out.println("Numarul de vocale este de: " + contor);
    }
}
