package day06_IfStatementsIntro;

public class IfAndElseStatementIntro {

    public static void main(String[] args) {

        // first we will do it using two separate if statements

        int age = 22;

       if( age >=21){

           System.out.println("Eligible");//it  will be executed if true

       }
       if(age<21){
           System.out.println("Not eligible");//otherwise this block will be executed
       }


        System.out.println("---------------if And else------------");

       // here we are solving the problem by using if And else statement


        if( age >=21){

            System.out.println("Eligible");//it  will be executed if true

        }
        else{
            System.out.println("Not eligible");//else this block will be executed
        }



    }
}
