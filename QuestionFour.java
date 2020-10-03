package Horsy.com.company;
    /*
    Write a program to find the factorial value of any number entered through the keyboard.
     */

import java.util.Scanner;
public class QuestionFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long factorial = 1;

        //Input a number
        System.out.print("Enter an integer: ");
        int numberChoice = input.nextInt();

        //number factorial
        for (int counter = 1; counter <= numberChoice; counter++){
            factorial = factorial * counter;

        }
        System.out.println("The factorial of " + numberChoice + " is " + factorial);
    }
}
