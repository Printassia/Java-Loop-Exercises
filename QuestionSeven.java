package Horsy.com.company;

import java.util.Scanner;

/*
Write a program that reads a set of integers,
and then prints the sum of the even and odd integers.
 */

public class QuestionSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        short even = 0, odd = 0;
        int numberChoices;
        char choice;
        do{
            System.out.print("Enter a set of integers: ");
            numberChoices = input.nextInt();

            //Even: If the number choices are divisible by 2 add those numbers up
            if (numberChoices % 2 == 0) {
                even += numberChoices;
            }
            //Odd: If the number choices are not divisible by 2 add those numbers up
            else {
                odd += numberChoices;
            }

            //Continue on?
            System.out.println("Do you want to continue y/n: ");
            choice = input.next().charAt(0);
        }
        while (choice == 'Y' || choice == 'y');
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd Numbers: " + odd);





    }
}

