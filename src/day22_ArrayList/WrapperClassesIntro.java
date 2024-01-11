package day22_ArrayList;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int a = 10;// primitive data type
        // to use these primitives in  data structures other than array, we need their wrapper classes as Integer is for int
        //the process of conversion from primitive to object class is known as autoboxing and this process is done implicitly and the vice versa is called unboxing
        Integer a2 = 10;

        System.out.println("---------------------------------------");

        int b = 100;
        Integer b1 = b;// auto boxing process, but the right class need to be selected as Integer for int as only assignment can be done from one class to other implicitly while for conversion we need the right class

        char ch = 'A';

        Character ch1 = 'A';// character is used for char conversion

        double d = 5.5;
        Double d1 = d;//double auto boxing, where the class is Double

        System.out.println("--------converting wrapper class object to primitive---------------");

        Integer n = 20;

        int n1 = n;// normally its best to be converted to its own primitive
        long n2 = n;// though it can be converted to other types
        //this process is known as unboxing

        Character e  = 'Z';
        char e1 = e;











    }
}
