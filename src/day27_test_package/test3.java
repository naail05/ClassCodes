package day27_test_package;

import day27_accessModifiers.AccessModifiers;

public class test3 {


    public static void main(String[] args) {

        //will try to access the public variables here

        System.out.println(AccessModifiers.publicData);// even we are able to access this data outside the package as it is a different package, it is visible and can be accessed here

        //will try to access the protected variables here

       // System.out.println(AccessModifiers.protectedData); protected data is not visible and accessible outside the given package as is not public, it could be if we were to creat a subclass, so we can say that protected is not always accessible outside the package

        //will try to access the default variables here

        // System.out.println(AccessModifiers.defaultData); default data is not visible and accessible outside the given package as is default not public.

        //will try to access the private variables here

        // System.out.println(AccessModifiers.privateData); private data is not visible and accessible outside the given package as it is not public.

        System.out.println("----------------------------------------------------");

        new AccessModifiers();//we can creat object for the public modifier in a different class and package, as it is public, so it is visible and accessible in a different class, and package and we can creat an object for


        System.out.println("----------------------------------------------------");
// only the public method is accessible outside the package, though protected could be in some cases, but not all
        AccessModifiers.publicMethod();
        //AccessModifiers.protectedMethod();
       // AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();
    }
}
