package day07_IfStatements;

public class Task8_GradeReport {

    public static void main(String[] args) {

        int score = 85;
        String result ="Your grade is: ";

        if(score >=90 ){
            result +="A";// here we are concatenating grade with the String of text we declared, else we have to repeat it over and over in every if-block, optimizing our codes to look shorter and cleaner
        }
        else if (score >=80 ){//else if (score >=80 && score<90) here the second condition "score<90" is allready checked in the first if block so no need to write it manually again here, so we only write the first condition here which i "score >=80"
            result +="B";
        }
        else if (score >=70 ){
            result +="C";
        }
        else if (score >=60 ){
            result +="D";
        }
        else {result +="F";}

        System.out.println(result);


    }
}

/*
Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a program that can print the grade of the student
Ex:
score = 95
output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100

 */
