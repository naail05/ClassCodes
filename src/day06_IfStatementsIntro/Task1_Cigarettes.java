package day06_IfStatementsIntro;

public class Task1_Cigarettes {

    public static void main(String[] args) {

        int age = 22;
        boolean isEligible = age >=21 && age<100;

        if(isEligible){

            System.out.println("You are  eligible to buy Cigarettes");
        }

        // write a program that can check if the person is eligible to buy cigarettes
        //output: You are not eligible to buy Cigarettes

        System.out.println("---------with creating boolean variable---------");

        if(age >=21 && age <100){

            System.out.println("You are  eligible to buy Cigarettes");
        }
        if(age<=21 ||age>100){

            System.out.println("You are  not eligible to buy Cigarettes");
        }

    }
}
