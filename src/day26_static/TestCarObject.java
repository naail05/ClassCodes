package day26_static;

public class TestCarObject {

    public static void main(String[] args) {
        Car car1 = new Car("Honda");
        System.out.println(car1);


        Car car2 = new Car("Hyondai","Elentra");
        System.out.println(car2);

        Car car3 = new Car("BMW","Q4", 2016);
        System.out.println(car3);

        Car car4 = new Car("Toyota","Corolla", 2019, 43000);
        System.out.println(car4);

        Car car5 = new Car("Benz","C550", 2020, 53000, "Gray");
        System.out.println(car5);

    }
}
