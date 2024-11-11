package ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Textul: ");
        String text = input.nextLine();

        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }
        if (text.equalsIgnoreCase(reverse)) System.out.println("Este palindrom.");
        else System.out.println("Nu este palindrom.");
    }
}
