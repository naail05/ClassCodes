package day09_switch_Scanner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//if we want to use it once then no need to store it in a variable as scanner input

        System.out.println("Enter the day number: ");
       //int num = new Scanner(System.in).nextInt();// this one is used when we want to use scanner only once here we dont need to closing and will taken care by Garbage colecter in java after use

        int num = input.nextInt();

        String day = " Invalid";
        if (num>=1 && num<=7){

            day = (num == 1 ) ? "Monday" :(num == 2 ) ? "Tuesday" :(num == 3 ) ? "Wednesday" :(num == 4 ) ? "Thursday" :(num == 5 ) ? "Friday" :(num == 6 ) ?  "Saturday" : "Sunday";
        }

        System.out.println(day);
        input.close();




    }
}
