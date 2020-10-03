package Horsy.com.company;

    /*
    Write a program that prompts the user to input a positive integer.
    It should then print the multiplication table of that number.
     */

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input a positive integer to get its multiplication table
        System.out.print("Enter a number to display its multiplication table: ");
        int numberChoice = input.nextInt();
        //Loop
        for (int count = 1; count <= 12; count++) {
            int result = count * numberChoice;
            System.out.println(count + " x " + numberChoice + " = " + result);
        }
    }
}