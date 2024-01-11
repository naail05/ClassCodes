package day34_abstraction.carTask;

public class TestCarObjects {
    public static void main(String[] args) {
        // Creating objects from each class
        //Car car = new Car("Accord", "gray", 2017, 25000.0); as it is an abstract class, so it can not be instantiated

        Honda hondaCar = new Honda("Accord", "Gray", 2020, 25000.0);
        Audi audiCar = new Audi("Q6", "Black", 2023, 40000.0);
        Tesla teslaCar = new Tesla("Model S", "White", 2023, 80000.0);

        // Demonstrating behaviors
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Honda Car Info: ");
        System.out.println(hondaCar);
        hondaCar.start();
        hondaCar.stop();//as it is final method, so will have the same implementation for all
        System.out.println();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Audi Car Info: ");
        System.out.println(audiCar);
        audiCar.start();
        audiCar.autoPark();
        audiCar.stop();//as it is final method, so will have the same implementation for all
        System.out.println();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Tesla Car Info: ");
        System.out.println(teslaCar);
        teslaCar.start();
        teslaCar.autoPilot();
        teslaCar.stop();//as it is final method, so will have the same implementation for all
    }
    }


