package day08_ternary_switch;

public class IfStatementAndTernary_Practice {

    public static void main(String[] args) {

        int score = 90;

        String result =" ";
        result = "Your grade is : ";

        if(score>=1 && score<=100) {//pre-condition which could be an if statement

           result += (score >=90 ) ? "A" :(score >=80 ) ? "B" : (score >=70 ) ? "C" :(score >=60 ) ? "D" : "F";
        } else {result ="Invalid Score";}

        System.out.println(result);

        System.out.println("--------------solving with Ternary only---------------");


        int score1 = 90;

        String result1 =" ";
        result1 = "Your grade is : ";

        result1 += (score1>=1 && score1<=100) ?

             (score1 >=90 ) ? "A" :(score1 >=80 ) ? "B" : (score1 >=70 ) ? "C" :(score1 >=60 ) ? "D" : "F" : "Invalid Score";

        System.out.println(result1);




    }
}
/*
 int score = 70;

        String result ="Your grade is: ";

        if(score>=1 && score<=100){

        if(score >=90 ){
            result +="A";
        }
        else if (score >=80 ){
            result +="B";
        }
        else if (score >=70 ){
            result +="C";
        }
        else if (score >=60 ){
            result +="D";
        }
        else {result +="F";}}
        else { result = "Invalid";}

        System.out.println(result);

 */