package day08_ternary_switch;

public class SwitchIntro {

    public static void main(String[] args) {

        /*
char grade = 'F';
        String result = "";//First we will assign temporary value "" so not to get error

        if (grade=='A') {result= "Excellent";}
        else if(grade=='B') {result ="Great job";}

        else if (grade=='C') {result="Good";}

        else if (grade=='D') {result = "Passed";}

        else {result ="Failed";}

        System.out.println(result);//now we only need one print statement
 */

        //compare the grade with other grades by using switch statement

        char grade = 'G';//compare with grades A, B, C, D, F
        String result = "";

        switch (grade) {
            case 'A'://the value type much with the data type of expression as is char in this case
                result = "Excellent";
                break;

            case 'B':
                result = "Great job";
                break;
            case 'C':
                result = "Good";
                break;


            case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invlid grade";//if none of the case is muching then this default case is going to run


        }
        System.out.println(result);

    }
}
