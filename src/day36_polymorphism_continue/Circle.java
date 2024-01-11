package day36_polymorphism_continue;

public class Circle {

    private double radius;
    public final static double PI = 3.14;


    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * PI;
    }


    public double perimeter() {
        return PI * radius * 2;
    }

    // override methods of the object class as toString, equals
    @Override
    public String toString() {//this allows us to display the information of circle object when it is passed in the print statement
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }


    //overriding equals() method

    @Override
    public boolean equals(Object obj) {
        //checking two circle objects if they are equal using equals method, but before that we have to confirm if the given object is instance of circle
        if(!(obj instanceof Circle)){//if the specified object is not circle, then we should not compare them
            System.err.println("Invalid Object");
        System.exit(1);}
        if (radius==((Circle) obj).radius){// this comparison will only be done if the object is circle, here we did downCasting from object class to circle object to access the instance variable of radius
            return true;//now if the current circle's radius is equal to the given circle's radius then they are equal
        } return false;
    }
}
