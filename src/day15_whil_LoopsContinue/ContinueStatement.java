package day15_whil_LoopsContinue;

public class ContinueStatement {

    public static void main(String[] args) {


        for (int i = 1; i <6 ; i++) {
            if(i==4){continue;}// means under this condition of continue i at 4 will be excluded and loop will continue afterward till the end of the condition
            System.out.println(i);}

            //so the difference between break and continue is, break fully terminate the loop, while continue just causes a skipp at the level or condition specified for.

            System.out.println("---------------------------------------------");
            for (int i = 10; i <21 ; i++) {//we want from 10 to 20 means 11 cycles
                //System.out.println(i);//now if we want to just print the odd/even numbers by using continue statement then we can do as:

                if(i%2==0){continue;}// means skip the even and just print the odd numbers
                System.out.println(i);}


        System.out.println("---------------------------------------------");


        for (char i = 'A'; i <='G'; i++) {

           // System.out.println(i);// this will print from A to G including G as <= operator is used

            if(i=='B' || i=='E'){continue;}// this will skip those two mentioned points and print the rest

            System.out.println(i);

        }

        }
    }

