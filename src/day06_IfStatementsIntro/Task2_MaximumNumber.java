package day06_IfStatementsIntro;

public class Task2_MaximumNumber {

    public static void main(String[] args) {


        int num1 = 50;
        int num2 = 100;

        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");

        }
        if (num2 > num1) {
            System.out.println(num2 + " is the maximum number");
        }
        if (num2 == num1) {
            System.out.println("Equal");
        }


    }

}
/*
    declare the following variables:
     1.num1
     2.num2
    write a program that can print the maximum number between the two numbers above, if both are equal then print equal

          Ex:
                 num1=10
                 num2=20

              output:
              20 is the maximum number

 */