package day27_accessModifiers;

public class Test {

    public static void main(String[] args) {
        System.out.println(StaticInitializationBlock.a);// when we are in the same package we can call static variables by their class name, no need for import statement in this case

        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        //ew StaticInitializationBlock();

        System.out.println("----------------------------------------------------");

        //will try to access the variables we created through public modifier here, within the same package, but different class

        System.out.println(AccessModifiers.publicData);// we can access the given data here through its class name

        System.out.println("----------------------------------------------------");
        //will try to access the variables we created through protected modifier here, with n the same package, but different class

        System.out.println(AccessModifiers.protectedData);//we can access the given data here through its class name, so it means protected is accessible within same package even though different class

        System.out.println("----------------------------------------------------");

        //will try to access the variables we created through default modifier here, within the same package, but different class
        System.out.println(AccessModifiers.defaultData);//we can access the given data here through its class name, so it means default is accessible within same package even though different class

        System.out.println("----------------------------------------------------");
        //will try to access the variables we created through private modifier here, within the same package, but different class
       //System.out.println(AccessModifiers.privateData);//we can not access the given data here through its class name as it is private, so it means private  is not accessible in different class even within same package

        System.out.println("----------------------------------------------------");

        new AccessModifiers();//we can creat object for the public within same package, not it is public, so it is visible and accessible in a different class, same package and we can creat an object for



        System.out.println("----------------------------------------------------");
// all the methods are accessible within the same package, but only private is not accessible
        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();

    }
}
