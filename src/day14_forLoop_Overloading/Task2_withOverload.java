package day14_forLoop_Overloading;

public class Task2_withOverload {

    public static void main(String[] args) {

        int number1 = sum(2,6);
        System.out.println(number1);//now out of these that method for which you give arguments will be executed

        int number2 = sum(2,6,8);
        System.out.println(number2);

        int number3 = sum(2,6,8,1);
        System.out.println(number3);

        double number11 = sum(2.4,3.6);
        System.out.println(number11);

    }
    public static int sum(int n1, int n2 ){//same method name for all the methods
        return n1+n2;
    }
    public static int sum(int n1, int n2 ,int n3){
        return sum(n1,n2)+n3;}

    public static int sum(int n1, int n2 ,int n3, int n4){
        return sum(n1,n2,n3)+n4;}
    public static double sum(double n1, double n2 ){//same method name for all the methods
        return n1+n2;}// here the number is same but the return type is different, so we can create a method with the same name
    public static double sum(double n1, double n2 , double n3){//same method name for all the methods
        return sum(n1,n2)+n3;}// this will return us sum of 3 double, as it will call the method with the matching parameters
    public static double sum(double n1, double n2 , double n3, double n4){//same method name for all the methods
        return sum(n1,n2,n3)+n4;}
}
