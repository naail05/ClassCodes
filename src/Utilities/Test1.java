package Utilities;

import day31_InheritanceOverriding.vehicle.ProtectedAccessModifier;

public class Test1 extends ProtectedAccessModifier{

    public static void main(String[] args) {

       // System.out.println(ProtectedAccessModifier.a);
      // ProtectedAccessModifier.method1(); in general condition they will not be accessible as protected are with same package, but in different package they are only accessible when there is subclass. So if Test1 (this class) is going to be the subclass of ProtectedAccessModifier then the mentioned method and variable will be accessible

        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.method1();


    }
}
