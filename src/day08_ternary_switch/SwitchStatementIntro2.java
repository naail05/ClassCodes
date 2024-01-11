package day08_ternary_switch;

public class SwitchStatementIntro2 {

    public static void main(String[] args) {

        //An integer variable named num is declared and given, Write a program that can print the name of the day that the num represents (use switch instead of if and else if
        //1~12 (means num are between 1 to 12

        int n = 6;
        String day = "";

        switch (n) {

            case 1:
                day = "Monday";
                break;


            case 2:
                day = "Tuesday";
                break;


            case 3:
                day = "Wednesday";
                break;


            case 4:
                day = "Thursday";
                break;


            case 5:
                day = "Friday";
                break;


            case 6:
                day = "Saturday";
                break;

            case 7:
                day = "Saturday";
                break;


            default:
                day = "Invalid";
        }

        System.out.println(day);


    }
}
