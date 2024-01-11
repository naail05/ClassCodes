package day32_finalKeyword.carTask_methdOverriding;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start "+getMake() +" "+getModel());
    }
}
/*

Create Audi sub-class and override the start() method if needed:

            Audi
                	start(): "Press the start button"
 */