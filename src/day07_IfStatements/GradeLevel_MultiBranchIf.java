package day07_IfStatements;

public class GradeLevel_MultiBranchIf {

    public static void main(String[] args) {

        String result = "";//First we will assign temporary value "" so not to get error

        int gradeLevel = 9;//grade level are between 1 and 18 or 1~18 (pre-condition)

       /* if (gradeLevel >= 1 && gradeLevel <= 5) {result= "Elementary school";}

        else if (gradeLevel >= 6 && gradeLevel <= 8) {result ="Middle school";}

        else if (gradeLevel >= 9 && gradeLevel <= 12) {result="High school";}

        else if (gradeLevel >= 13 && gradeLevel <= 16) {result = "College";}

        else  {result ="Grad school";}

        System.out.println(result);//now we only need one print statement

        instead of this we can write as follow
        */

        if ( gradeLevel <= 5) {result= "Elementary school";}

        else if ( gradeLevel <= 8) {result ="Middle school";}

        else if ( gradeLevel <= 12) {result="High school";}

        else if ( gradeLevel <= 16) {result = "College";}

        else  {result ="Grad school";}

        System.out.println(result);//now we only need one print statement
    }
}
/*

Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a program to determine and print which school type someone is in
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are: 1 ~ 5: Elementary school
6 ~ 8: Middle school 9 ~ 12: High school 13 ~ 16: College
17 ~ 18: Grad School
Assume that the given number is 1 ~ 18
 */