package day08_ternary_switch;

public class TernaryIntro3 {

    public static void main(String[] args) {

        int score = 55;


        String result = (score>= 0 && score<=100) ? (score>=60) ? "Student passed the exam" : "Student failed the exam"

                : "Invalid";
        System.out.println(result);


        System.out.println("-------------------------------------------------------------");

       //write a program to know if the student passed or failed, there are two possible outcomes

        int num = 8;


        String day = (num>=1 && num <=7 ) ? (num == 1 ) ? "Monday" :(num == 2 ) ? "Tuesday" :(num == 3 ) ? "Wednesday" :(num == 4 ) ? "Thursday" :(num == 5 ) ? "Friday" :(num == 6 ) ?  "Saturday" : "Sunday" : "No such a day";
        System.out.println(day);








    }
}
/*

  //write a program to know if the student passed or failed, there are two possible outcomes

int score = 50;

        if(score>= 0 && score<=100) {// thi is a pre-condition

            if(score>=60){System.out.println("Student passed the exam");}

            else{System.out.println("Student failed the exam");}}

            else{System.out.println("Invalid Score");}


 */