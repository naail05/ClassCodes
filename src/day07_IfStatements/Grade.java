package day07_IfStatements;

public class Grade {

    public static void main(String[] args) {

        String result = "";//First we will assign temporary value "" so not to get error

       char grade = 'A';

        if (grade=='A') {result= "Excellent";}

        if (grade=='B') {result ="Great job";}

        if (grade=='C') {result="Good";}

        if (grade=='D') {result = "Passed";}

        if (grade=='F') {result ="Failed";}

        System.out.println(result);//now we only need one print statement

    }
}

/*

 Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement
 */
