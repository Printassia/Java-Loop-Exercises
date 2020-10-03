package Horsy.com.company;

import java.util.Scanner;

/*
Write a program that prompts the user to input a positive integer.
It should then output a message indicating whether the number is a prime number.
*/

public class QuestionEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letterChoice;

        do {
            System.out.print("Input a positive integer: ");
            short number = input.nextShort();

            if (number / number == 1 && number % 2 != 0) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }

            System.out.print("Do you want to continue: y/n: ");
            letterChoice = input.next().charAt(0);

        } while (letterChoice == 'Y' || letterChoice == 'y');
    }
}
