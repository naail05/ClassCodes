package day09_switch_Scanner;

import java.util.Scanner;

public class EligibleNotEligib_Scanner {

    public static void main(String[] args) {
        // write a program that can check if the person is eligible to buy cigarettes
        //output: You are not eligible to buy Cigarettes

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = input.nextInt();
        String result ="";

        boolean isEligible = age >=21 && age<100;

        if(age >0 && age <=150){
            if(isEligible){

                result="You are  eligible to buy Cigarettes";
            } else { result="You are  not eligible to buy Cigarettes";}

        } else {result = "Invalid age number";}

        System.out.println(result);
        input.close();





    }
}
