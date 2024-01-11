package day07_IfStatements;

public class Grade2_multiBranchIf {

    public static void main(String[] args) {

        //will solve this exercise with multi-branch if


        char grade = 'F';
        String result = "";//First we will assign temporary value "" so not to get error

        if (grade=='A') {result= "Excellent";}
        else if(grade=='B') {result ="Great job";}

        else if (grade=='C') {result="Good";}

        else if (grade=='D') {result = "Passed";}

        else {result ="Failed";}

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
