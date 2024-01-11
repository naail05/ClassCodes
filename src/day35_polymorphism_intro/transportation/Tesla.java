package day35_polymorphism_intro.transportation;

public class Tesla extends Car implements AutoPilot, Electric{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void authPark() {

    }

    @Override
    public void autoPilot() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportation() {

    }

    @Override
    public void start() {

    }
}
/*
Create a sub class of Car named Tesla that implements AutoPark, AutoPilot and Electric
 */