package day27_accessModifiers;

public class AccessModifiers {

    // here we want to declare three variables and three methods and see, how and where we can access them
    // will make variables static, so that we can call them through the class name, and do not need to create an object

    public static int publicData = 200;

    protected static int protectedData = 300;

    static int defaultData = 500;// for default we dont have any keyword, or when we dont specify access modifier then that will be counted as default. this is only visible within class and package.

    private static int privateData = 600;


    public static void main(String[] args) {
        System.out.println(publicData);// we can access this in the class through its name as it is public

        System.out.println(protectedData);// we can access this in the class through its name as it is protected, and can be accessed within the same class

        System.out.println(defaultData);// we can access this in the class through its name as it is default and can be accessed within the same class

        System.out.println(privateData);//we can access private within the class through its name

        new AccessModifiers();//we can creat object for the public within same class
        new AccessModifiers();

        // all the methods are accessible within the same class

        publicMethod();
        protectedMethod();
       defaultMethod();
       privateMethod();





    }
    // now lets creat a public constructor
    public AccessModifiers(){

    }
    //now lets creat a public method

    public static void publicMethod(){

        System.out.println("Public");
    }
    //now lets creat a protected method
    protected static void protectedMethod(){

        System.out.println("Protected");
    }

    //now lets creat a default method
    static void defaultMethod(){

        System.out.println("Default");
    }

    //now lets creat a private method
    private static void privateMethod(){

        System.out.println("Private");
    }

}
