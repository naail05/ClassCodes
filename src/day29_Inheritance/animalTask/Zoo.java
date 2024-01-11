package day29_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', "Medium", "White", 4);

        Cat cat1 = new Cat();
        cat1.setInfo("Lulu", "Stray", 'F', "Medium", "white", 2);

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Sheer Khan", "Bengal", 'M', "large", "Gray", 12);


        System.out.println(dog);
        System.out.println(cat1);
        System.out.println(tiger1);

        System.out.println("---------------------------------------------");

        dog.eat();//calling eat method through dog object
        dog.sleep();
        dog.drink();

        cat1.sleep();

        tiger1.eat();//calling eat method through tiger object, this shows that these methods were inherited to the tiger method from the animal class(super/parent class)

        dog.bark();//this is unique method for the dog class

        tiger1.hunt();//this is unique method for the tiger class, which need not be defined in the parent class

        cat1.meow();//this is unique method for the cat class, which need not be defined in the parent class

        System.out.println("---------------------------------------------");


        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setAge(5);

        System.out.println(dog.getAge());




    }
}
