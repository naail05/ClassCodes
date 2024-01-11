package day34_abstraction.carTask;

public class Tesla extends Car {

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " use the mobile app to start the car");

    }

    //unique method for tesla class
    public void autoPilot() {
        System.out.println(getMake() + " " + getModel() +" has auto-pilot feature");
    }
}
