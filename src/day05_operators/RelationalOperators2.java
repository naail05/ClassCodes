package day05_operators;

public class RelationalOperators2 {

    public static void main(String[] args) {

        System.out.println("----------------equal'==' operator-----\n");
        System.out.println(1000==2000);//comparing numbers, result will be false in this case
        System.out.println("Java"=="Java");// true as both are same
        System.out.println("java"=="Java");//false as there are case differences and java is case sensetive.
        System.out.println("Muhtar"=="Good Guy");//result is false as they are different strings
        System.out.println(true==false);//false

        System.out.println("----------------not equal'!=' operator-----\n");
        System.out.println(1000!=2000);//comparing numbers, result will be true in this case
        System.out.println("Java"!="Java");// true as both are same, result will be false
        System.out.println("java"!="Java");//true as there are case differences and java is case sensetive.
        System.out.println("Muhtar"!="Good Guy");//result is true as they are different strings
        System.out.println(true!=false);//true






    }
}
