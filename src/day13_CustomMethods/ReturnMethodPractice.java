package day13_CustomMethods;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        int output = maximum(16,9);
        System.out.println(output);

        System.out.println("------------------------------------------");
        System.out.println(minimum(23,25));

        System.out.println("-----------------------------------------");

        System.out.println(oddEven(5));

        System.out.println("----------------------------------");
        System.out.println(odd(6));

        System.out.println("----------------------------------");
        System.out.println(even(4));

    }
    public static int maximum (int num1, int num2){
        return (num1>num2)? num1: num2;}// here we are using turnary and directly assigning it to the return, means this is what will be returned at the end

    public static int minimum (int num1, int num2){
        if(num1>num2){
        return num2;// this return can be used for returning a value or exiting the return method

        } else{ return num1;}}

    public static String oddEven (int digit){

        String result;
        if(digit%2==0) { result = digit+" is an even number";
        }
        else{result = digit+" is an odd number";
      ;} return result;
    }

    public static boolean odd (int number1){

        //boolean result = (number1%2!=0)? true:false;
             //return result;

             //thi can also be solved as
        return (number1%2!=0)? true:false;


    }
    public static boolean even (int number1){
        return !odd(number1);// here we called odd number method and took the opposite of it which is even so the result will be true
    }

}
