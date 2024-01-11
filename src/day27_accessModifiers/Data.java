package day27_accessModifiers;

public class Data {

    public  int a, b, c ;//instance variables

    public static  int d, e, f;// static variables

    public void method1 (){
        System.out.println("Method 1");
    }

    public void method2 (){
        System.out.println("Method 2");//instance method
    }

    public static void method3 (){
        System.out.println("Method 3");//static method
    }

    public static void method4 (){
        System.out.println("Method 4");
    }
// lets suppose that we need some of the members of this class in other classes, packages

}
