package day31_InheritanceOverriding.vehicle;

public class Bike extends Vehicle{


    public Bike(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);

    }


    public void ride(){
        System.out.println("Riding "+ getBrand()+" "+getModel());
    }
}
