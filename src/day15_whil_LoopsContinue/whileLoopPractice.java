package day15_whil_LoopsContinue;

import java.util.Scanner;

public class whileLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        while (!(age>=1 && age<=150))//while the age is invalid this will keep repeating
        {System.err.println("Invalid entry !Please re-enter your age:");
            age =input.nextInt();}

        if (age>= 21 ){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");}

        input.close();
    }}

