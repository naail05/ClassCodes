package day07_IfStatements;

public class Task7_MonthName {

    public static void main(String[] args) {

        int number = 13;
        if (number >=1 && number<=12){

        if (number == 1) {System.out.println( "January");}

        else if (number == 2) {System.out.println("February");}

        else if (number == 3) {System.out.println("March");}

        else if(number == 4) {System.out.println("April");}

        else if (number == 5) {System.out.println ("May");}

        else if (number == 6) {System.out.println("June");}

        else if (number == 7) {System.out.println("July");}

        else if (number == 8) {System.out.println("August");}

        else if (number == 9) {System.out.println ("September");}

        else if (number == 10) {System.out.println("October");}

        else if (number == 11) {System.out.println("November");}

        else  {System.out.println("December");}}
        else{
            System.out.println("No such a month");
        }


    }
}
/*

 Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a program that can print the name of the month that the number represents (only if the given number is a valid number, then print the name of the month. Otherwise print Invalid.
Ex: Given:
number = 10
output: October
 */