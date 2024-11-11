package org.example.ex3;

import java.util.Scanner;

//Daca nr. este par sau impar cu input
//Citeste mai multe numere
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //mai bine aici pt.ca in while se creeaza de fiecare un nou ob.Scanner

        boolean isRunning = true;
        while (isRunning) {

            System.out.println ("Numarul este: ");
            int number = input.nextInt();
            if (number == 0){
                //break;
                isRunning = false;
            }

            else if (number % 2 == 0) {
                System.out.println("Numarul este par.");
            }
            else {
                System.out.println("Numarul este impar.");
            }
        }
    }
}
