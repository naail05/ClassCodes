package day26_static;

public class ConstructorCalls {

    public ConstructorCalls(){

        System.out.println("Default constructor");
    }

    public ConstructorCalls (int a){

        // can we call the constructors the same way as other methods in each others body?
        //ConstructorCalls(); this will give us compile error, we can not call one constructor in other as other methods by its name.
        //this() need to be used

        this();// as the first constructor is not having any parameter, so we can call it like this


        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls (double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls (String c){

        // calling the second constructor and it has parameter which is double, we need to pass double argument accordingly
        this(5.5);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

         method1(); //when method one is called and gets executed, it will only print the code in method one body

        System.out.println("-------------------------------------");
        method2();// when method2e is called and gets executed, it will  print the code in method1 and method2 bodies both as method2 already called method 1 in its body

    }

    public static void method1(){

        System.out.println("Method 1");
    }

    public static void method2 (){

        method1(); // we can call other method(s) by calling its name in the method
        System.out.println("Method2");

    }



}
