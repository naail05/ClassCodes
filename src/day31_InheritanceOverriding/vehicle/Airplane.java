package day31_InheritanceOverriding.vehicle;

public class Airplane extends Vehicle{


    public Airplane(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    public void fly(){
        System.out.println(getBrand()+" "+getModel()+ "is flying");
    }


}
