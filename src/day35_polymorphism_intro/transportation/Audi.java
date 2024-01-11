package day35_polymorphism_intro.transportation;

public class Audi extends Car implements AutoPark{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void authPark() {

    }

    @Override
    public void transportation() {

    }

    @Override
    public void start() {

    }
}
/*
Create a sub class of car named Audi that implements AutoPark
 */