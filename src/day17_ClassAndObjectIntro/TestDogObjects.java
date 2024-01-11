package day17_ClassAndObjectIntro;

public class TestDogObjects {

    public static void main(String[] args) {
// here we will create object from the Dog class we already specified earlier.

      //new Dog();// to be reusable then have to store it to variable

        Dog dog1 = new Dog();
        dog1.name = "Mikey";
        dog1.breed = "Huskey";
        dog1.size = "Medium";
        dog1.gender = 'F';
        dog1.age = 3;
        dog1.color = "white";
        // this is the first object we created from the dog class. We can creat as many objects as we want from a class

        dog1.eat();//now the object is defined, so it will directly refer to that object, if not then it will print null, the default value

        System.out.println("dog1 = " + dog1);// Dog@7e0ea639, hash code error will occur, whenever there is no toString method then it will give us this .
        //toString method in java is building method which is used for printing, converting any method into the console, as it is custom created method thats why it doesnt have built in toString method, so we need to add/give

        Dog dog2 = new Dog();
        dog2.name ="Lucy";
        dog2.breed = "Bulldog";
        dog2.size = "Large";
        dog2.gender = 'F';
        dog2.age= 2;
        dog2.color = "Black";
        // now this is a separate copy of the instance for object 2(dog2). If we dont provide these it will print the default fol all which is null.

        System.out.println("dog2 = " + dog2);

        //now if we try to creat more and more objects and then try to call these instances and setting them we have to do it one by one in this case. But if we creat a method in the instance(Dog) class and then call the method to set the information for us.

        Dog dog3 = new Dog();
        dog3.setInfo("Lolo", "Husky", "Medium", 'M', 3, "Gray");

        System.out.println("dog3 = " + dog3);

        Dog dog4 = new Dog();
        dog4.setInfo("Loki", "Wolf", "Large", 'M', 4, "Gray");

        System.out.println("dog4 = " + dog4);

        dog4.eat();// this is an instance method and the action will happen only on the mentioned object not others

        dog2.drink();




    }

}
