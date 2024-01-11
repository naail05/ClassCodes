package day25_constructors;

public class Rectangle {

    public double length, width;// attributes we added

    /*
    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;

        now instead of setInfo we will use constructor, which gets executed automatically
    }
    */
//now we need to define constructor in the rectangle class
    public Rectangle (double length, double width){

        this.length = length;
        this.width = width;



    }



    public double area(){
        return length * width;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}
