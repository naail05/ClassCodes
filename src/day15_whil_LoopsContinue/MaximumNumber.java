package day15_whil_LoopsContinue;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max =-2147483648;// the minimum value of integer in Java, taken from google

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
           int num = input.nextInt();

           if(num >max){max = num;}// if the user entered entry is greater than the current maximum number that we have then the user entered number should be maximum number


        }
        System.out.println("Maximum number is: " + max);

    }
}
/*

1. Write a program that can ask the user to enter a number for 5 times and returns the maximum numbe
 */