package day03_variables;

public class PritiveDataTypes_intro2 {

    public static void main(String[] args) {
        //DataType variableName= Data; (the Syntax for data type, this is how we declare and store different types of data)

        char a = '@'; // we give single quote ' '
        char b ='!';

        System.out.println(a);
        System.out.println(b); //anything can be assigned to char as long as its a single character
        //char also has a range from 0-65535
        System.out.println("-------------------------------------------------");
        char ch1 =65;
        char ch2 = 66;
        System.out.println(ch1);
        System.out.println(ch2);
        // even if we use numbers for char they will return the single character corresponding to that number (most probably from ascii table)

        //boolean r1=123; (gives compiling error as boolean only accepts or assign is true or false)

        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100>10; //true
        boolean r7= 20>30; //false
        System.out.println(r6);
        System.out.println(r7);





    }

}
