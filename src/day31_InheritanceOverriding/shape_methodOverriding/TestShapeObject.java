package day31_InheritanceOverriding.shape_methodOverriding;

public class TestShapeObject {

    public static void main(String[] args) {

        Square square = new Square(4);
        System.out.println(square);
        square.draw();

        System.out.println("-----------------circle object-----------------");

        Circle circle = new Circle(3.5);
        System.out.println(circle);
        System.out.println(circle.area());// area of circle

        System.out.println("-----------------rectangle object-----------------");

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println(rectangle);
        System.out.println(rectangle.area());
        rectangle.draw();

    }
}
