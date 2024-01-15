package day38_exceptions_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();// age from user just once, so we do not need Scanner more than once
        if(age< 0 || age>150){
            System.err.println("Invalid age");
           // System.exit(1);//this is how we used earlier, without throw keyword
            //so we can create an exception instead of System.exit(1), with the help of throw keyword and can create object of that exception class
            //throw new InputMismatchException();//this will not only terminate the program, but also will tell us where the exception occurred
            // or we can use throw keyword with if statement as:

            if(age<0){
                throw new InputMismatchException("Age of the person can not be negative");
            }else{
                throw new InputMismatchException("Age of the person can not be greater than 150");
        }}
        if(age>=21){
            System.out.println("Eligible");
        }else {
            System.err.println("Ineligible");
        }

    }
}
