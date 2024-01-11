package day27_accessModifiers;

public class testCircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(4.5);
        System.out.println(circle1);

        Circle circle2 = new Circle(3.5);
        System.out.println(circle2);

        Circle circle3 = new Circle(5);
        System.out.println(circle3);

        //if we want to call a static variable we can call it through th class name rather than the object and the reason is that, its value will be the same for all the objects

       // System.out.println(circle1.pi); calling pi through class the objects
       // System.out.println(circle1.pi);
        System.out.println(Circle.pi);// calling pi through class name

        // but we we need to call any instance wwe need to call them through the object, as class can not share whatever an object has, as radius in this case, as it is going to be be different for each object
      //  System.out.println(Circle.radius);
        System.out.println(circle1.radius);
        System.out.println(circle2.radius);
    }
}
