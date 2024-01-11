package day06_IfStatementsIntro;

public class OperatorPrecedence {

    public static void main(String[] args) {
        System.out.println(5+2*3);//result will be 11 as first multiplication will be executed then addition
        System.out.println((5+2)*3);//now 21 as () will precede over multiplication
        System.out.println(7+3-2/2);//9 as division will take precedence over addition and subtraction

        System.out.println(10>9==8<7);
        //                 true==false so the result will be false as true is not equal to false

        System.out.println(10>9==8<7 && "Java"=="Python" || 'a'=='A');
        //                 true == false     false            false ,  so the result will be false
        //                      false      && false       || false
        //                                false    ||false
        System.out.println( 100>=20 && 40*2>60);// multiplication will be executed first, result will be true
        //                   100>=20 &&  80>60
        //                     true  &&  true      , >= and > will be executed
        //                            true         , && will be executed
        
        
        int a = 20; 
        a += 10+2*3;
        // a += 10+6
        // a += 16 then
        //a = 36

        System.out.println("a = " + a);



    }
}
