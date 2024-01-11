package day07_IfStatements;

public class NestedIfIntro {
    public static void main(String[] args) {

         int score = 50;// there is a bug as in the code till we dont specify the range of the score, so there is a pre-condition that the score need to be valid

        //write a program to know if the student passed or failed, there are two possible outcomes

        if(score>= 0 && score<=100) {// thi is a pre-condition

            if(score>=60){System.out.println("Student passed the exam");}

            else{System.out.println("Student failed the exam");}}

            else{System.out.println("Invalid Score");}


        System.out.println("----------------------------------------------------------");

        int age = 1253;
        // write a program to know if the person is Eligible to buy alcohol or not, considering all the possible inputs
        // so we will creat a pre-condition

        if (age>=1 && age<=150)//pre-condition

        if( age >=21){

            System.out.println("Eligible");}

        else{
            System.out.println("Not eligible");
        }
        else {
            System.out.println("Invalid age");}

        System.out.println("-----------------------------------------------------------------");



        // the advantage of nested if is that if the pre-condition is not met then Java will not run the inner if-block and will print/execute the else block


        int day  = 12;
        if(day>=1 && day<=7){

        if (day == 1 ) {System.out.println("Monday");}

        else if (day == 2 ) {System.out.println("Tuesday");}

        else if (day == 3 ) {System.out.println("Wednesday");}

        else if (day == 4 ) {System.out.println("Thursday");}

        else if (day == 5 ) {System.out.println("Friday");}

        else if (day == 6 ) {System.out.println("Saturday");}

        else {System.out.println("Sunday");}}

        else {
            System.out.println("Invalid number");}



    }
}
