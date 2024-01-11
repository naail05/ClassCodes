package day28_Encapsulation.personTask;

public class testPersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Naail");

        Person person2 = new Person("Nazir", 'M');

        Person person3 = new Person("Maryam", 8);

        Person person5 = new Person("Mus", "Pashto");

        Person person4 = new Person("Rashid", 4, 'M');

        Person person6 = new Person("Bashir", 35, 'M', "Pashto");

        System.out.println(person1);

        System.out.println(person2);

        System.out.println(person3);

        System.out.println(person4);

        System.out.println(person5);

        System.out.println(person6);


        person2.drink("Pepsi");

        person4.eat("Fries");

        person3.eat("Pizza");









    }


}
