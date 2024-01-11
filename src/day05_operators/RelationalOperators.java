package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {
        System.out.println("-------greater than '>' operators-------\n"); //result will be boolean
        int a = 10000;
        int b = 800;

        System.out.println(a>b);//result will be true as 1000 is more than 800
        System.out.println(b>a);// result will be false as 800 is not greater than 1000
        // you can also creat boolean variable

        boolean aIsGreater = a>b;
        System.out.println(aIsGreater);

        System.out.println("-------greater than or equal '>=' operators-------\n"); //result will be boolean

        int score = 80;// verify if the student passed the exam
        boolean passed = score>=60;

        System.out.println(passed);

        int age = 21;// eligible to vote
        boolean elligibleToVote = age>=18;
        System.out.println(elligibleToVote);

        System.out.println("-----------Less than'<' operator-----------\n");
        //we will use the score example

        score = 55;
        boolean failed = score<60;
        System.out.println(failed);//true
        System.out.println();

        // example of vote
        age = 17;
        boolean notElligibleToVote = age<18;
        System.out.println(notElligibleToVote);
        age = 19;
        System.out.println();
        System.out.println("-----------Less than or equal'<=' operator-----------\n");
        int p = 100;
        int k = 120;
        System.out.println(p<=k);//true as 100 is less than 120
        System.out.println(50<=40);// false as 50 is not less than or equal to 40

        System.out.println('a'>'b');//didnt give compile error as these characters represent numbers (as in ascii table
        //System.out.println("java">"python");will give compile error as these relational operators can only be use with numbers while this is a string









    }
}
