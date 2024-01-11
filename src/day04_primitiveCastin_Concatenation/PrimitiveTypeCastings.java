package day04_primitiveCastin_Concatenation;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {

        //-----------Implicit Casting(smaller to larger)-----

        byte a = 15;

        short b = a; // casting done implicitly



        System.out.println(b);

        int c = a;
        System.out.println(c);

        int age = 55;

        System.out.println((long) age);
        System.out.println();
        System.out.println();
        System.out.println("------------Explicit Casting ------------");

        //assigning larger primitive type to smaller

        int X = 100;

        ///byte Y = X; this will give compile error, so we have to cast it explicitly

        byte Y = (byte)X;

        System.out.println(Y);

        float D = 20.4f;//we gave "f" here to force the compiler to take the value as float not double, which is the preferred method
        short E = (short)D;
        int G = (int) D; //if we dont do casting and give us compile error then the short-cut which we can use is press the "option  key" and hit "enter" it will give us the possible solutions, where the first is in this case.



        System.out.println(E);// it will only take the integer value and ignore the decimal point(s) .8 in this case for example. opposite will be the case if we cast from "int" to "double" means it will add a decimal point to the integer .0 for example.

        int Age1 = 35;

        System.out.println((double) Age1);
        System.out.println("------------------------------");
        System.out.println();
        System.out.println(G);

        //if we assign a larger value then the data-range of the given primitive type then that will not generate that value and come-up with a random (negative )number based on its calculation. for eg:
        // short a = 1000
        //byte b = (byte) a;  in this case the result will be a random negative number as its outside the range of byte






    }
}
