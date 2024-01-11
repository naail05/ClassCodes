package day31_InheritanceOverriding.shape_methodOverriding;

public class Shape {

    private String name;

    public Shape() {
        setName(getClass().getSimpleName());// this means that all the child classes will set their name to their class
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){

        return 0;//will give default value, as there is no single formula for calculating the area of all the shapes
    }

    public double perimeter(){
        return 0;//will give default value, as there is no single formula for calculating the perimeter of all the shapes

    }

    public void draw(){

        System.out.println("Drawing a "+ getClass().getSimpleName());
        // as there no single method to draw the shapes of  the Shape variables
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", Perimeter='" + perimeter() + '\'' +
                '}';
    }
}
