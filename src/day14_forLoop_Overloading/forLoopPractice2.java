package day14_forLoop_Overloading;

import java.util.Scanner;

public class forLoopPractice2 {

    public static void main(String[] args) {

        // ask the user to enter number by 10 times, or 10 numbers
        //here we will use scanner object
        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number ");
           sum += input.nextInt();// now that we want this to be repeated for 10 times so we are creating loop here for this entry

        }
        System.out.println("sum = " + sum);



    }
}
