package day31_InheritanceOverriding.vehicle;

public class Boat extends Vehicle{

    public Boat(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    public void sail(){
        System.out.println(getBrand()+" "+getModel()+" is sailing");
    }


}
