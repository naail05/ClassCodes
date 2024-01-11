package day08_ternary_switch;

public class TernaryIntro2 {

    public static void main(String[] args) {


//positive, negative, zero
        int num = -10;
        String Day = "";

        if(num>0){Day = "Positive";
        } else if ( num<0) {Day ="Negative";
        } else { Day = "Zero";}// all the data in the blocks are String value and one statement
        System.out.println(Day);// so ternary can be used

        System.out.println("-------------------with Ternary---------------------");

        String result2 = (num>0) ? "Positive" :( num<0) ? "Negative" : "Zero";
        System.out.println(result2);


        System.out.println("-------------------multi-branch with Ternary---------------------");

        //Days of the week

        int n = 1;
        String day = "";

        if (num == 1 ) {

            day = "Monday";
        }

        else if (num == 2 ) {

           day ="Tuesday";
        }

        else if (num == 3 ) {

            day ="Wednesday";
        }

        else if (num == 4 ) {

            day  = "Thursday";
        }

        else if (num == 5 ) {

            day ="Friday";
        }

        else if (num == 6 ) {

            day ="Satureday";
        }

        else  {

            day ="Sunday";
        }

        System.out.println(day);

        System.out.println("-----------------now with Ternary----------------------");

        String day2 = (num == 1 ) ? "Monday" :(num == 2 ) ? "Tuesday" :(num == 3 ) ? "Wednesday" :(num == 4 ) ? "Thursday" :(num == 5 ) ? "Friday" :(num == 6 ) ?  "Saturday" : "Sunday";
        System.out.println(day2);

        System.out.println("-----------------------------------------------------");

        //An integer variable named num is declared and given, Write a program that can print the name of the month that the num represents (use Ternary instead of if and else if
        //1~12 (means num are between 1 to 12

        int Num = 6;

        String month = (Num == 1 ) ? "January" :(Num == 2 ) ? "February" :(Num == 3 ) ? "March" :(Num == 4 ) ? "April" :(Num == 5 ) ? "May" :(Num == 6 ) ?  "June" :(Num == 7 ) ? "July" :(Num == 8 ) ? "August" :(Num == 9 ) ?  "September":(Num == 10 ) ?
                "October" :(Num == 11 ) ? "November" :  "December";
        System.out.println(month);









    }
}
