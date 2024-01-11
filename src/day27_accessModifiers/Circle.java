package day27_accessModifiers;

import java.text.DecimalFormat;

public class Circle {

    public double radius,diameter;// as they are instance variable and will be different for each object, so in order to set them, we need to have a constructor, as constructor gets executed for each object, so this way we will have separate copy for each of the constructor

    public static double pi =3.14;// as this is a static variable, so we can set them here and they will be same for all the objects

    public Circle(double radius) {// the constructor name has always need to be the same with the class name
        this.radius = radius;
        diameter= 2 * radius;
    }

    public double calcArea (){// this has to be instance as each object will have a different area and the variables called/ accessed include instance variables, which can not be accessed through static
        return pi*radius*radius;
    }

    public double calcPerimeter (){
        return 2*pi*radius;
    }

    public static void printPiValue (){

        System.out.println("PI' value is: "+ pi);

    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", Perimeter = "+df.format(calcPerimeter())+
                ", PI = "+ df.format(pi)+
                ", Area = "+df.format(calcArea())+
                '}';
    }
}
/*
Warmup tasks:
    Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */