package day12_CustomMethodsIntro;

public class MaximumNumber_withMethod {

    public static void main(String[] args) {

        maximumNumber(200,200);
        //now whatever times we want and fow whatever number we just call the method and compare the numbers

    }

    //create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)

    public static void maximumNumber(double num1,double num2){// we should only pass as many parameters as needed, else when we are to call the method then we have to provide that many number of arguments else it will not be executed(arguments are the data which will be assigned to the parameters)


        if(num1>num2){
            System.out.println(num1+" is maximum number");
    } else if (num2>num1) {System.out.println(num2+" is maximum number");

        }else {
            System.out.println("Both numbers are equal");}}
    }
