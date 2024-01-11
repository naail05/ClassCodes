package day27_test_package;

import static day27_accessModifiers.Data.d;// here we only want to import d

import static day27_accessModifiers.Data.method3;// here we only want to import method 3

import static day27_accessModifiers.Data.*;//when we need to import all the static members
public class test2 {

    public static void main(String[] args) {

//now how if we need some of the members of the data class here, not everything, then which import statement do we need?
        // though we can use regular import statement and access all the members of the class, but that is not necessary, so we can use static import statement, where without importing the class we can access/import its static members as they do not depend upon the object

        System.out.println(d);// so here we can directly access d without calling its class name

        method3();


        // we can now  call and import all the static variables of the class, without calling their names, again need to mention ONLY static members not instances
        method4();

        System.out.println(e);

        System.out.println(d);





    }
}
