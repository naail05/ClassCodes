package day13_CustomMethods;

import java.util.Scanner;

public class ReturnStatementPractice {

    public static void main(String[] args) {
        //for exiting function

        char grade = new Scanner(System.in).next().charAt(0);// after next method we used charAt to return the mentioned char value
        //lets use switch statement

        boolean isValid = grade=='A'|| grade=='B'|| grade=='C'|| grade=='D'|| grade=='F';
        if (!isValid){
            System.err.println("Invalid grade");
            return;}//once the return statement gets executed, then whatever codes are after this they will not be executed/terminates the main method if true

        switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good job");
                break;
            case 'C':
                System.out.println("Very good");
                break;
            case 'D':
                System.out.println("Good");
                break;
            default:
                System.out.println("Fail");


        }

    }
}
