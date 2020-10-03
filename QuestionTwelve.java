package Horsy.com.company;

import java.util.Scanner;

/*
Write a program to enter the numbers till the user wants
and at the end the program should display the largest and smallest numbers entered.
 */
public class QuestionTwelve {
    public static void main(String[] args) {
        int numbers;
        int smallestNumber = Integer.MAX_VALUE, largestNumber = Integer.MIN_VALUE;
        char choice;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter as much numbers are you want: ");
            numbers = input.nextInt();

            if (numbers < smallestNumber) smallestNumber = numbers;
            if (numbers > largestNumber) largestNumber = numbers;

            //Continue on ?
            System.out.print("Do you want to continue y/n ? ");
            choice = input.next().charAt(0);
        }
        while(choice == 'Y' || choice == 'y');
        //Output
        System.out.println("Smallest Number is: " + smallestNumber);
        System.out.println("Largest Number is: " + largestNumber);
    }
}
