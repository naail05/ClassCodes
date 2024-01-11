package day06_IfStatementsIntro;

public class IfAndElsePractice {

    public static void main(String[] args) {

        // will do the task of student passed of failed the exam, as there could only be two possible outcomes

        int score =80;

        //as there is only one possible outcome, so one out the following two blocks will be executed

        if(score>=60){

            System.out.println("Student passed the exam");
        }
        else{
            System.out.println("Student failed the exam");

        }

    }
}
