package org.example.ex8;

import java.util.Scanner;

//Count Uppercase and Lowercase Letters
//Write a program to count how many uppercase and lowercase letters are in a given string.
//Expected output (for input "Hello World"):
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Textul: ");
        String text = input.nextLine();

        int contor1 = 0;
        int contor2 = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(Character.isUpperCase(c)){
                contor1++;
            }
            else if (Character.isLowerCase(c)){
                contor2++;
            }
        }
            System.out.println("In text exista " + contor1 + " litere mari.");
            System.out.println("In text exista " + contor2 + " litere mici.");
        }
    }


