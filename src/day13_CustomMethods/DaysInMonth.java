package day13_CustomMethods;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();// we are not using the number more than once thats why we are not assigning to a variable
        if(month<1 || month>12){
            System.err.println("Invalid number");
            return;//this will terminate the main method if this condition is met
        }{
            switch (month){

                case 1 : case 3 : case 5 :case 7 :case 8 :case 10 :case 12 : //when same then we can declare them lik this one or like below and then the common result and break statement, as we cant use || logic in switch statements and so we cant achieve the && logic
                    System.out.println("31 days");
                    break;

                case 2 :
                    System.out.println("28 days");
                    break;

                default:// this will include rest of the cases with 30 days
                    System.out.println("30 days");}


        }

    }
}
/*

  int month = 121;
        String result = "";

        switch (month){
            case 1 : case 3 : case 5 :case 7 :case 8 :case 10 :case 12 : //when same then we can declare them lik this one or like below and then the common result and break statement, as we cant use || logic in switch statements and so we cant achieve the && logic
                result = "31 days";
                break;

            case 4 :
            case 6 :
            case 9 :
            case 11 :
                result = "30 days";
                break;
            case 2 :
                result = "28 days";
                break;

            default:
                result = "Invalid days";

        }
        System.out.println(result);

 */