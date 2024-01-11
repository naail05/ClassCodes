package day27_accessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car();//Car object

       Car.CarEngine obj2 = obj1.new CarEngine();//this is how to creat object for the inner class( when the inner class is not static)

       Car.StaticInnerClass obj3= new Car.StaticInnerClass();// object of static inner class








    }

}
