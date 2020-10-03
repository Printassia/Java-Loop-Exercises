package Horsy.com.company;

/*
    Write a program that prompts the user to input an integer and then
    outputs the number with the digits reversed.
    For example, if the input is 12345, the output should be 54321.
*/
import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String originalNumbers, reversedNumber = "";

        //Enter any amount of integers:
        System.out.print("Enter integers numbers: ");
        originalNumbers = input.nextLine();

        int length = originalNumbers.length();

        for (int loopCount = length - 1; loopCount >= 0; loopCount--){
            reversedNumber += originalNumbers.charAt(loopCount);
        }
        System.out.println(originalNumbers + " reversed: " + reversedNumber);
    }
}
