package day35_polymorphism_intro.transportation;

public abstract class Car extends Transportation {

    public Car(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

  public  void drive() {

      System.out.println("Driving "+getMake()+" "+getModel());
  }
}
/*
 Create an abstract sub class of Transportation named Car

				extra methods:
					drive()
 */