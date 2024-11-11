package org.example.ex4;

import java.util.Scanner;

/*
*/
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int produs = 1;
        //copNumber ca sa pot afisa in sout
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (number != 0) {
            int rest = number % 10;
            sum += rest;
            produs *= rest;
            number /= 10;
        }
        System.out.println("Suma cifrelor este: " + sum);
        System.out.println("Produsul cifrelor este:" + produs);

    }
}


