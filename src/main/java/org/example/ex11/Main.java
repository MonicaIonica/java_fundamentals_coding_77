package org.example.ex11;

//Calculate Sum and Average
//Given an array of integers, calculate the sum and average of its elements.
//Expected output (for input [2, 4, 6, 8, 10]): Sum: 30, Average: 6.0

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10,17};
        int sum = 0;
        int average = 0;

        for (int number : numbers){
            sum = sum + number; //sum = sum + numbers[i] (daca e for i) !!!

            average = sum/numbers.length;
        }
        System.out.println(sum);
        System.out.println(average);
    }
}
