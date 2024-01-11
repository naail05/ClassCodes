package day36_polymorphism_continue;

public class Square {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }


    public double perimeter() {
        return side * 4;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)) {
            System.out.println("Invalid object, object must be square");
            System.exit(1);}
        if (side == ((Square) obj).side) {
            return true;
        }return false;
    }
}
