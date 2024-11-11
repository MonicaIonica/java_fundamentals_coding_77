package org.example.ex6;

import java.util.Scanner;

/*
String Length and Character Count
Ask the user for a string input. Print the length of the string and count how many times the character a appears.
Expected output (for input "Java programming"): Length: 15, Count of 'a': 3

 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Textul");
        String text = input.nextLine();

        char c = 'a';
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (c == text.charAt(i)) sum++;
        }
        System.out.println("Caracterul apare de " + sum + " ori");
        System.out.println("Lungimea textului este: " + text.length());
    }
}
