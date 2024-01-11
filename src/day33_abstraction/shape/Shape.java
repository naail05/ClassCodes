package day33_abstraction.shape;

public abstract class Shape {

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

    public abstract double area();


    public abstract double perimeter();

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
