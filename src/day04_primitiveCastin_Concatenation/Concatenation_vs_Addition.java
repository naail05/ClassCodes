package day04_primitiveCastin_Concatenation;

public class Concatenation_vs_Addition {

    public static void main(String[] args) {
        System.out.println("---------Concatenation--------");

        System.out.println("32"+1);// here "32" is not counted as number,but a string instead that is why the printed result is going to be 321

        System.out.println(7+"12");// as long as we have string on either side of the "+" operator then it will be concatenation, not addition
        System.out.println("The value is "+true);

        System.out.println("12"+"10");//same is the case here, concatenation
        System.out.println();
        System.out.println("-------------Addition-------------");
        System.out.println(12+10);//Addition
        System.out.println(10+2.5);





    }
}
