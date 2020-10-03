package Horsy.com.company;

import java.util.Scanner;

/*
    Write a do-while loop that asks the user to enter two numbers.
    The numbers should be added and the sum displayed.
    The loop should ask the user whether he or she wishes to perform the operation again.
    If so, the loop should repeat; otherwise it should terminate.
     */
public class QuestionTen {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            char choice;

            do{
                System.out.print("Input the first number: ");
                short firstNum = input.nextShort();
                System.out.print("Input the second number: ");
                short secondNum = input.nextShort();

                int sum = firstNum + secondNum;
                System.out.println(sum);

                //Continue on ?
                System.out.print("Do you want to continue y/n ? ");
                choice = input.next().charAt(0);
            }
            while(choice == 'Y' || choice == 'y');
            //Output for n/no
            System.out.println("Goodbye");
        }
}
