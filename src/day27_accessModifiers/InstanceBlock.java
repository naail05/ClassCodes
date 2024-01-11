package day27_accessModifiers;

public class InstanceBlock {

    {
        System.out.println("This is an instance block");
    }// this runs for each object before the constructor when the object is created

    public InstanceBlock(){

        System.out.println("Constructor");

    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();
    }

}
