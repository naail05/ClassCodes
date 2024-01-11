package day03_variables;

public class PrimitiveDataType_intro {

    public static void main(String[] args) {

        //byte a ="Java";// it gives compile error Because byte only accept the given range of integer values(-128~127) while Java is string of text
       // byte a = 20.5; it gives compile error because its a decimal number

        //byte a = 128; still we will get compile error as this number is out of byte range
        byte a = 126;

        //price of the car is $17500

        short p = 17500; //-32768to 32767 is the short range
        System.out.println("p");
        System.out.println(p);// we only type the name not the double quotes

        // salary is $95000
        int s = 95000; //-2147483648 to 2147483647 is the int range
        System.out.println(s); //everytime we call the variable it will give us the given data/number

       // long n = 9999999999; //it gives compile error because the preferred data type is int
        long n = 9999999999L; // we are forcing the compiler by adding L to take it as long

        //out of the above four types of integer data type int is used more, only is special seniors long will be used when its out of int range

        //GPA of a student is 3.5,
        // for storing this value I have to use double (floating-point) data type, where double is preferred

        double gpa = 3.5;

        //float gpa2 = 3.5; will give us compile error, but we can force the compiler to take it as float by adding capital or small F at the end of number

        /*
        primitive:
          for integers: the preferred data type is int
          for decimals: the preferred data type is double
          for single characters: the data types used is char
         */




    }


}


//DataType variableName= Data; (the Syntax for data type, this is how we declare and store different types of data)