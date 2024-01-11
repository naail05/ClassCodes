package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        System.out.println("--------logical And operator'&&'-------");// means both

        double salary = 70000;
        int creditScore = 550;

        boolean eligibleForLoan = salary >= 30000 && creditScore>=650;//And Operator
        System.out.println(eligibleForLoan);
        //the result will be false means only one condition is met thats why the result is false, means he is not eligible for loan.
        // the only time the result will be true when both conditions are met

        salary = 80000;
        creditScore = 700;
        boolean EligibleForLoan = salary >= 30000 && creditScore>=650;
        System.out.println(EligibleForLoan);// now the result will be true as both the AND conditions are met.

        //we can add more boolean expressions as well
        salary = 80000;
        creditScore = 700;
        int age = 25;
        boolean isEligibleForLoan = salary >= 30000 && creditScore>=650 && age>=18;
        System.out.println(isEligibleForLoan);


        //Example find if the person is eligible to vote in USA
        System.out.println("------------------------------------------");
        age = 18;
        String country = "USA";
        boolean eligibleToVote = age>=18 && country=="USA";
        System.out.println(eligibleToVote);//true as both the AND conditions are met


        System.out.println();
        System.out.println("-----------logical OR  ||  Operator---------\n");//means either

        String answer = "maybe";

        boolean validAnswer = answer=="yeas" || answer =="No";// none of the conditions are met so the result will be false
        System.out.println(validAnswer);

        answer="yes";
        boolean  ValidAnswer = answer=="yes" || answer =="No";

        System.out.println(ValidAnswer);

        //check if the person passed the exam using OR operator

        char grade = 'B';

        boolean passed = grade == 'A' || grade == 'B' || grade =='C' || grade =='D';
        System.out.println(passed);//the result will be true as he got B
        System.out.println();

        System.out.println("-----------logical NOT  !  Operator---------\n");//means the opposite

        System.out.println( true);
        System.out.println( !false);// opposite of false is true, so the result will be true

        String a = "yes";

        boolean yes = a =="yes";// true
        boolean no = !yes;//false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);


        // for the pass and fail

        int score = 55;
        boolean isPass= score >=60;
        boolean isFail = !isPass;
        System.out.println("isPass = " + isPass);
        System.out.println("isFail = " + isFail);

        System.out.println("--------------------------------------------");
        System.out.println( true ==!false && false ==!true && true!= !true);// true
        //                      true            true               true















    }
}
