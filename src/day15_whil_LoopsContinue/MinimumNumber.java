package day15_whil_LoopsContinue;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int min =2147483647;// the minimum value of integer in Java, taken from google

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if(num <min){min = num;}// if the user entered entry is less than the current minimum number that we have then the user entered number should be minimum number





        }
        System.out.println("Minimum number is  = " + min
        ); input.close();
    }


}
