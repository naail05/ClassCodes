package day32_finalKeyword.carTask_methdOverriding;

public class TestCarObject {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "White", 2023,30000);

        Honda honda = new Honda("Accord", "Gray", 2017, 13000);

        Audi audi = new Audi("Q6", "Silver", 2021, 50000);

        BMW bmw = new BMW("X6", "Black", 2017, 45000);

        Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("----------------call the start method--------------");

        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();

        System.out.println("----------Tesla car----------------------");
        tesla.setPrice(52000);
        tesla.setModel("Model H");//methods we overrod
        System.out.println(tesla);
        tesla.autoPilot();
    }
}
