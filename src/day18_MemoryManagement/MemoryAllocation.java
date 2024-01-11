package day18_MemoryManagement;

class car{

    public String model;
    public  String color;
    public  String brand;// the default value for all the above will be "null"
    public int year;// the default value will be zero


}

public class MemoryAllocation {

    public static void main(String[] args) {
        int a = 100;// this being a local variable, so it will be allocated into and stored in the stack memory

        car car1 = new car();
        // car1 is reference variable and is referencing to car object

    }
public  static void method1(){// these methods will be allocated into the stack memory
        int b = 200;// this being a local variable, so it will be allocated into and stored in the stack memory
}
    public  static void method2(){

        String c = "Hello world";// this local variable "C" is  a local variable but referencing to an object, a string object, so the referencing variable :c in this case" will be stored in stack memory while the object will be stored in heap memory
        //now thats its string literal so it will be allocated to the string pool, which is in the heap, but if created through new keyword then that object will be stored in the heap

    }
}
