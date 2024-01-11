package day16_LoopsContinue_nestedLoops;

import java.util.Scanner;

public class Calculator_nestedLoop {

    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);


            String answer = "yes";

            while (answer.equals("yes"))
            {
                System.out.println("Enter your first number: ");
                double num1 = input.nextDouble();

            System.out.println("Enter desired math operator: ");
            char operator = input.next().charAt(0);


            while (!(operator == '+' || operator== '-' ||operator == '*' || operator == '/')){
                System.err.println("Invalid Operator! Please re-enter the math operator");//while the operator in invalid these statements will be repeated over and over again
                operator = input.next().charAt(0);}

            System.out.println("Enter your second number: ");
            double num2 = input.nextDouble();

            double result =(operator == '+')? (num1+num2):(operator== '-' )? (num1-num2) : (operator == '*')? (num1*num2):(num1/num2);

            System.out.println("result = " + result);

                System.out.println("would you like to continue? Yes/no");
                answer= input.next().toLowerCase();
            //now ask the user if he would like to continue or not
            // if the user wants to continue then repeat all the above process once again if not then exit the loop. we will use while loop once again for the mentioned task.
                while (!(answer.equals("yes") || answer.equals("no"))) {
                    System.err.println("Invalid entry! Would you like to continue? Yes/No");
                    answer = input.next().toLowerCase();}

        }}



        }


/*

write a program for a simple calculator
1. ask user to enter a number :(double)
2. ask user to enter a math operator: (+,*,/,-)
  if the user enters invalid operator, repeat the same step until the user enters a valid operator
  3. ask the user to enter the second number :(double)
  4. display the calculator result
  5. would you like to continue? (yes/no)


 */