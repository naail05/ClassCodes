package day14_forLoop_Overloading;

public class OverloadingMainMethod {

    public static void main(String[] args) {//There are three main methods, one already defined by Java and is in the system liabrary and two we specified, but Java will only run the one already built or defined in the laibrary.
        //so the conclusion is : main method can be overloaded, but there is no benefit of doing so, so we better not to overload. only the real method can make the java file runnable

        System.out.println("A");





    }

    public static void main (int [] args){
        System.out.println("B");
    }
    public static void main (double [] args){//overloading main method
        System.out.println("C");
    }

}
