package day36_polymorphism_continue;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setHeight(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setHeight(double length) {
        this.length = length;
    }

    public double area() {
        return width * length;
    }


    public double perimeter() {
        return 2 * ( width+ length);
    }

    @Override
    public boolean equals(Object obj) {
       if (!(obj instanceof Rectangle)){
           System.err.println("Invalid comparison, both objects must be rectangle");
           System.exit(1);
       }
       if (width==((Rectangle) obj).width && length==((Rectangle) obj).length){
           return true;
       }
       return false;
    }
}
