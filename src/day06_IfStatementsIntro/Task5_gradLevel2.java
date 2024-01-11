package day06_IfStatementsIntro;

public class Task5_gradLevel2 {
    public static void main(String[] args) {

        //how if we assign string value to a variable

        String result = "";//First we will assign temporary value "" so not to get error

        int gradeLevel = 15;

        if (gradeLevel >= 1 && gradeLevel <= 5) {

            result= "Elementary school";
        }

        if (gradeLevel >= 6 && gradeLevel <= 8) {

            result ="Middle school";
        }

        if (gradeLevel >= 9 && gradeLevel <= 12) {

            result="High school";
        }

        if (gradeLevel >= 13 && gradeLevel <= 16) {

            result = "College";
        }

        if (gradeLevel >= 17 && gradeLevel <= 18) {

            result ="Grad school";
        }

        System.out.println(result);//now we only need one print statement




    }

}
