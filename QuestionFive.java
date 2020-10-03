package Horsy.com.company;

/*
Two numbers are entered through the keyboard.
Write a program to find the value of one number raised to the power of another.
 */

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Integer 1: ");
        int integerOne = input.nextInt();

        System.out.print("Integer 2: ");
        int integerTwo = input.nextInt();

        //Value of one number raised to the other
        int integerExponent = (int) Math.pow(integerOne, integerTwo);

        System.out.println(integerOne + " raised to the power of " + integerTwo +
                " is " + integerExponent);
    }
}
