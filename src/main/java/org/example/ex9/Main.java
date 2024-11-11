package org.example.ex9;
//Remove Duplicate Characters
//Prompt the user to enter a string, then remove any duplicate characters.
//Expected output (for input "programming"):

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Textul: ");
        String text = input.nextLine();
        String text2 = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (text2.indexOf(c) == -1) {
                text2 = text2 + c;
            }
        }
        System.out.println(text2);
    }
}
