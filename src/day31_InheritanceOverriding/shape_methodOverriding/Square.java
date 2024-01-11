package day31_InheritanceOverriding.shape_methodOverriding;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        setSide(side);
    }//constructor to add the extra variable side which is unique to the square class

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        super.draw();//This is calling a draw method in the superclass
        System.out.println("\t* * * * * *");

        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");// This prints the sides of the square
        }
        System.out.println("\t* * * * * *");
    }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + getName()+ '\'' +
                ", side='" + side + '\'' +
                ", area='" + area() + '\'' +
                ", Perimeter='" + perimeter() + '\'' +
                '}';
    }
}
