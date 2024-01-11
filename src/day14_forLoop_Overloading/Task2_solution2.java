package day14_forLoop_Overloading;

public class Task2_solution2 {

    public static void main(String[] args) {

        int number1 = sumOfTwoNumbers(2,6);
        System.out.println(number1);

        int number2 = sumOfThreeNumbers(2,6,8);
        System.out.println(number2);

        int number3 = sumOfFoursNumbers(2,6,8,1);
        System.out.println(number3);




    }
    public static int sumOfTwoNumbers(int n1, int n2 ){
        return n1+n2;
    }
    public static int sumOfThreeNumbers(int n1, int n2 ,int n3){
        return sumOfTwoNumbers(n1,n2)+n3;}

    public static int sumOfFoursNumbers(int n1, int n2 ,int n3, int n4){
        return sumOfThreeNumbers(n1,n2,n3)+n4;}

}
