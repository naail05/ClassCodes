package day36_polymorphism_continue;


import day33_abstraction.employeeTask.*;
import day35_polymorphism_intro.transportation.Electric;
import day35_polymorphism_intro.transportation.Tesla;

public class TestEqualsMethod {

    public static void main(String[] args) {

      Circle circle1 = new Circle(3.5);

      Circle circle2 = new Circle(3.5);

        Circle circle3 = new Circle(5);

        System.out.println(circle1==circle2);// this will compare the memory allocation of these two objects, as they have different memory allocation, then it will return false

        //now will compare circle object with something else which is not circle object
        //System.out.println(circle1.equals("Java"));

        //now will compare these two circle objects
        System.out.println(circle1.equals(circle2));//true as their radius are same

        System.out.println(circle1.equals(circle3));//false as their radius are not same, so they are not equal

        System.out.println("-------------------------------------------------");

        IPhone iphone1 = new IPhone("Apple", "Iphone 14", "Medium", 900, "Gold");

        IPhone iphone2 = new IPhone("Apple", "Iphone 14", "Medium", 900, "Gold");

      IPhone iphone3 = new IPhone("Apple", "Iphone 14", "Medium", 900, "Black");


        System.out.println(iphone1.equals(iphone2));
      System.out.println(iphone2.equals(iphone3));

      System.out.println("---------------------------------");
      Rectangle rectangle1 = new Rectangle(4, 6);
      Rectangle rectangle2 = new Rectangle(5, 7);
      Rectangle rectangle3 = new Rectangle(4, 6);

      System.out.println(rectangle1.equals(rectangle2));
      System.out.println(rectangle1.equals(rectangle3));

      System.out.println("---------------------------------");
      Electric electric = new Tesla("Model Y", "White",2021, 45000);// parent interface is the reference type
      //now based on the polymorphism rule we can only access whatever is in reference variable, so if we want to access the unique methods and variables of the object typer we need to do downCasting, so because this need, we need to do downCasting
      electric.charge();

      ((Tesla)electric).authPark();
      ((Tesla)electric).autoPilot();

      System.out.println("---------------------------------");

      Employee employee1 = new Teacher("Maryam", 8, 'F', "A214", "Math teacher", 120000);
      employee1.work();

      Employee employee2 = new Developer("Nazir", 6, 'M', "A231", "Developer", 125000,"Java");
      employee2.work();

      Employee employee3 = new Driver("Aaron", 36, 'M', "AC24", "Driver", 67000);
      employee3.work();

      Employee employee4 = new Tester("Naail", 36, 'M', "AB2343", "QA", 121000);
      employee4.work();
      //now that this work method is overridden and so available in all the object classes as well and has many implementations, in this case the overridden one in the related object type will be implemented

    }
}
