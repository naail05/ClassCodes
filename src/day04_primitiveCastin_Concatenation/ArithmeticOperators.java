package day04_primitiveCastin_Concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("----------Addition--------");

        System.out.println(100+200);//two numbers, so will have addition
        System.out.println();
        System.out.println("-------Subtraction-------");
        System.out.println(40-10);//we need to have numbers on both sides
        System.out.println();
        System.out.println("-----------Division Operator--------");
        System.out.println(50/6);//as both are int values
        System.out.println(50/6.0);//denominator is double, so will get the decimal (exact) value
        //for getting the decimal result one of the values must be or converted to double value, either by adding .0 or "d" with the value
        System.out.println(50d/6);
        //to covert decimal value to integer we can do casting:
        System.out.println((int)(2.5/0.5));
        //As in maths denominator can not be zero, same is the case with Java
        System.out.println();
        System.out.println("-------------Multiplication Operator----------");
        System.out.println(5*12);
        System.out.println(7*15);
        System.out.println();
        System.out.println("-----------Modulus Operators----------------");
        System.out.println(10%3);
        System.out.println(20%6);
        System.out.println(15%4);// will give us the remainder as result(the left-over from the operation of division)





    }
}
