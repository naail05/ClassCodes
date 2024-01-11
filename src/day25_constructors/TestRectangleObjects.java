package day25_constructors;

public class TestRectangleObjects {

    public static void main(String[] args) {

        /*
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(3,4);

        Rectangle rectangle2 = new Rectangle();
        rectangle1.setInfo(4,5);

        Rectangle rectangle3 = new Rectangle();
        rectangle1.setInfo(3,6);

        Rectangle rectangle5 = new Rectangle();
        rectangle1.setInfo(2,4);

        Rectangle rectangle4 = new Rectangle();
        rectangle1.setInfo(5,7);
        //in order to set the instance variables, we have to call the setInfo method manually each time( like five times in this case

        */

        //after we set our custom constructor

        Rectangle rectangle1 = new Rectangle(3,4);
        Rectangle rectangle2 = new Rectangle(3,5);
        Rectangle rectangle3 = new Rectangle(2,4);
        Rectangle rectangle4 = new Rectangle(3,4);
        Rectangle rectangle5 = new Rectangle(4,6);

        // here we dont need setInfo any more and can directly give the values for length and width

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);


    }
}
