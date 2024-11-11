package org.example.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println ("Numarul: ");
        int number = input.nextInt();
        int number2 = number;
        int palindrom = 0;

        while (number2 != 0) {
            palindrom = palindrom * 10 + (number2 % 10);
            number2 /= 10;
        }
        if (palindrom == number) System.out.println("Este palindrom");
        else System.out.println("Nu este palindrom");
    }
}
