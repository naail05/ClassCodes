package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        //Pre increment/decrement (++ or -- before the operand)

        int x= 10;
        System.out.println(++x);//pre increment, where value of x will be changed by 1 immediately
        System.out.println(x);//if we print after pre, it will give us the new/incremented value
        System.out.println();
        System.out.println(--x);//pre decrement, where value of x will decrease 1 immediately
        System.out.println();

        int w = 50;
        int r = ++w;// new value will be passed to "r" and the value of "w" will increment by 1

        System.out.println("r = " + r);
        System.out.println("w = " + w);//both will be 51
        System.out.println();

        //post increment/decrements : this will change the value, but postpone the change
        int b= 25;
        System.out.println(b--);//will decrease the value but with postpone, first pass the old value
        System.out.println(b);// will change the value by 1, so in post we have two steps

        System.out.println(b++);//here it takes the latest value of "b" first which is 24 and the increment by 1
        System.out.println(b);

        System.out.println("-----------------------------------------------------------");

        int n = 30;



        int m = n++; // m= 30, because post increment passes the old value first, then the value of n will eventually decrease by 1
        System.out.println("m = " + m);
        System.out.println("n = " + n);// n will be 31
        System.out.println("--------------------------------");
        System.out.println();

        int z = 60;
        int q = z--; //q=60 while z=59
        System.out.println("q = " + q);
        System.out.println("z = " + z);
        




    }
}
