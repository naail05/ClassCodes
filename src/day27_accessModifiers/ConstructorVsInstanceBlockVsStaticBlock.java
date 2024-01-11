package day27_accessModifiers;

public class ConstructorVsInstanceBlockVsStaticBlock {


    //first will creat constructor
    public ConstructorVsInstanceBlockVsStaticBlock(){

        System.out.println("Constructor");// this once take parameter
    }

    //then will creat instance block

    {
        System.out.println("Instance Block");//these dont take parameters and arguments, they will only be executed when object is created and then will run separately for each object
    }

    //then will creat static block

    static {
        System.out.println("Static Block");// this will get executed only once
        //the execution flow will be, first static will get executed then instance block and then constructor
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        new ConstructorVsInstanceBlockVsStaticBlock();
        new ConstructorVsInstanceBlockVsStaticBlock();
    }

}
