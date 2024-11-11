package org.example.ex2;
/*
Sum of Natural Numbers
Write a program that uses a for loop to find the sum of the first 10 natural numbers.
Expected output: The sum of the first 10 natural numbers is: 45
 */
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int j = 10;
        do {
            sum = sum + i++;
        }
        while (i < j);

//        while (i < j) {
//            sum = sum + i++;
//        }

//        for (int i = 1; i < 10; i++) {
//            //sum = sum + i;
//            sum += i;
//        }
       System.out.println("The sum of the first 10 natural numbers is " + sum);
    }
}
