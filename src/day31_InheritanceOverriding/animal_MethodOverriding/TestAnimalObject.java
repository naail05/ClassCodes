package day31_InheritanceOverriding.animal_MethodOverriding;

public class TestAnimalObject {

    public static void main(String[] args) {

        Cat cat = new Cat("Emily", "Bengle", 'F', "Medium", "White", 2);

        Dog dog = new Dog("Max", "Husky", 'M', "Medium", "Gray", 3);

        Loin loin = new Loin("Sher Khan", "African Loin", 'M', "Large", "Yellow", 5, true);

        Eagle eagle = new Eagle("Bella", "Asian Eagle", 'M', "Large", "Black & white", 6);


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(loin);
        System.out.println(eagle);

        System.out.println("========================eat method===============================");

        cat.eat();
        dog.eat();
        loin.eat();
        eagle.eat();

        System.out.println("========================sleep method===============================");

        cat.sleep();
        dog.sleep();
        loin.sleep();
        eagle.sleep();

    }
}
