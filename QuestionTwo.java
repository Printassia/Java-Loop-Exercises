package Horsy.com.company;

    /*
    Write a program to calculate the sum of first 10 natural number.
    */

public class QuestionTwo {
    public static void main(String[] args) {
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            sum = count + sum;
        }
        System.out.println("Sum =" + sum);
    }
}
