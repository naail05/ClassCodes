package day27_test_package;


import day27_accessModifiers.Data;
public class test {

    //now what we need to do if we want to use/access any member of the data class(instances or static)
    //we need  import statement

    public static void main(String[] args) {
    // as for the regular import statement we can only access static members, variables and methods, not the instances
       // System.out.println(Data.a); instance variable, which we can not call through th regular import statement
        System.out.println(Data.d);
        System.out.println(Data.f);
        System.out.println(Data.e);// these are the static members which we can call through their names

       Data.method3();
       Data.method4();// calling static methods

        //now if we creat an object

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);// we can call these instance variables through the object we created

        obj.method1();
        obj.method2();

        //so regular import statement technically can import everything to this class

        // now what if we only need some static members and methods in a class not all the members including the instances, is this import statement going to be necessary in that case?




    }



}
