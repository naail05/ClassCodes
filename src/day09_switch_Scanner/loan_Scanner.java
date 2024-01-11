package day09_switch_Scanner;

import java.util.Scanner;

public class loan_Scanner {

    public static void main(String[] args) {
        Scanner loan = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = loan.nextInt();

        System.out.println(" Enter your credit score: ");
        int creditScore = loan.nextInt();



        String result = "";


        if (salary >= 45000 && creditScore >= 700) {

            result=("You are eligible for the loan");
        } else {
            result=("You are  not eligible for the loan");
        }

        System.out.println(result);
        loan.close();




    }
}
