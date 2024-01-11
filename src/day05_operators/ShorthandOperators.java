package day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        System.out.println("----------Assignment Operator--------------\n");

        int a = 20;

        System.out.println("a = " + a);//a=20 will be getting 20 for a as it was assigned
        System.out.println("a = " + a);
        System.out.println();

        a = 40; //here after this area we are calling the variable and assigning new value to it
        System.out.println("a = " + a);
        a=90; //we are assigning new value to variable a after this
        System.out.println("a = " + a);
        System.out.println();
        System.out.println("-------------Addition assignment operator--------------\n");
        System.out.println();// this is just for adding space

        double balance = 100;
        balance += 1000; //balance will be the old value(100) plus the new value =1100 in this case

        System.out.println("balance = " + balance);
        balance += 500;
        System.out.println("balance = " + balance);// current (1100) plus 500

        System.out.println("----------Subtraction assignment operator--------------\n");
        balance -= 800; //balance will be current (1600)-800=800
        System.out.println("balance = " + balance);
        System.out.println("-------------Multiplication Assignment Operator----------\n");

        double salary =45000;//lets say after completing this course salary will double
        salary*= 2;
        System.out.println("salary = " + salary);//new salary=90000
        //lets say after sometimes it gets tripled
        salary *=3;
        System.out.println("salary = " + salary);

        double betcoine = 5;

        betcoine *= 100;
        System.out.println("betcoine = " + betcoine);

        System.out.println("--------------Division Assignment Operator-----------\n");
        //lets say after 6 months the value drops to half

        betcoine /= 2;
        System.out.println("betcoine = " + betcoine);

        //lets say there is 50% cut in the annual salary
        salary /=2;
        System.out.println("salary = " + salary);

        System.out.println("---------remainder assignment operator-----------\n");

        int s= 40;
        s %= 7;
        System.out.println("s = " + s);//will return the remainder value





    }
}
