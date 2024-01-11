package day07_IfStatements;

public class LoanApplication {

    public static void main(String[] args) {

        int Salary = 45000,
                creditScore = 700;


        if (Salary >= 45000 && creditScore >= 700) {

            System.out.println("The person is eligible for the loan");
        }

        System.out.println("---------------If And Else------------");

        String result ="";


        if (Salary >= 45000 && creditScore >= 700) {

            result=("The person is eligible for the loan");
        } else {
            result=(" The person is not eligible for the loan");
        }

        System.out.println(result);


    }
}



/*

Create a class named LoanApplication. two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700


	2. Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement
 */