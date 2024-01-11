package day27_accessModifiers;

public class StaticBlock {

    static{
        System.out.println("Static Block");// this will be executed first
    }
    public StaticBlock(){

        System.out.println("Constructor");// this will rus as per the number of objects, twice in this case
    }

    public static void main(String[] args) {

        System.out.println("Main Method");// this will execute after the static block

        new StaticBlock();
        new StaticBlock();
        //the static block execution does not depend upon the object and will execute once, while if there is constructor that will execute as per the number of objects(once foe each object)
    }

    static{
        System.out.println("Static block 2");// irrespective of where the static block is, before or after the main method, it will run and execute before main method
    }
}
