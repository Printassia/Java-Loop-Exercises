package Horsy.com.company;

import java.util.Scanner;

/*
Write a program to enter the numbers till the user wants
and at the end it should display the count of positive, negative and zeros entered.
 */

public class QuestionEleven {
    public static void main(String[] args) {

        int numbers;
        int positiveNumbers = 0, negativeNumbers = 0, zerosEntered = 0;
        char choice;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter as much numbers are you want: ");
            numbers = input.nextInt();

            //positive numbers count
            if (numbers % 2 == 0 && numbers > 0) positiveNumbers++;
            //negative numbers count
            else if (numbers < 0) negativeNumbers++;
            //zeros counted
            else if (numbers == 0) zerosEntered++;

            //Continue on ?
            System.out.print("Do you want to continue y/n ? ");
            choice = input.next().charAt(0);
        }
        while(choice == 'Y' || choice == 'y');
        //Output
        System.out.println("Positive Numbers Count: " + positiveNumbers);
        System.out.println("Negative Numbers Count: " + negativeNumbers);
        System.out.println("Zeros Entered Count: " + zerosEntered);
    }
}
