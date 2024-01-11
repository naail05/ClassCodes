package day18_MemoryManagement;

import day17_ClassAndObjectIntro.Dog;

public class GarbageCollection {

    public static void main(String[] args) {


        String s1 = "Java";
        // this object wont be eligible for garbage collection

        //at this moment there could be two ways to make it eligible for garbage collection

        s1 = null;// one way for garbage collection. After this line it will not give any other object than null, so it will be eligible for garbage collection.

        System.out.println(s1);

        System.out.println("------Another way for garbage collection-------------");

        String str1 = "Python";
         str1 = "CYDEO";
         //now that we re-allocated str1 then that object "python here "will be eligible for garbage collection
        System.out.println(str1);

        System.out.println("------------------------------------------");

        Dog dog3 = new Dog();
        dog3.setInfo("Lolo", "Husky", "Medium", 'M', 3, "Gray");
        // in order to make dog3 object eligible for garbage collection is either assign it to null keyword or assign another object to it as dog3=dog4;
        // garbage collector calls the finalize method and collects the objects

        Dog dog4 = new Dog();
        dog4.setInfo("Loki", "Wolf", "Large", 'M', 4, "Gray");

        dog3= dog4;
        System.out.println(dog4);
    }
}
