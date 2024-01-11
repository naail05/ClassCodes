package day25_constructors;

import day17_ClassAndObjectIntro.Dog;
import day17_ClassAndObjectIntro.Dog2;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfMethodPractice {

    public static void main(String[] args) {
        Dog2[] dogs = {new Dog2(), new Dog2(), new Dog2(), new Dog2(), new Dog2(), new Dog2()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        //  1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList
        ArrayList<Dog2> smallDogs = new ArrayList<>();
        smallDogs.addAll(Arrays.asList(dogs));
       smallDogs.removeIf(p-> !p.size.equals("Small") );

        for (Dog2 each : smallDogs) {

        }
        System.out.println(smallDogs);

        System.out.println("-----------------------------------------------");
        // 1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

        ArrayList<Dog2> youngDogs = new ArrayList<>();
        youngDogs.addAll(Arrays.asList(dogs));
        youngDogs.removeIf(p-> p.age> 4 );

        for (Dog2 each : youngDogs) {

        }
        System.out.println(youngDogs);

        System.out.println("-----------------------------------------------");
       // 1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

        ArrayList<Dog2> femaleDogs = new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dogs));
        femaleDogs.removeIf(p-> p.gender =='M' );

        for (Dog2 each : femaleDogs) {

        }
        System.out.println(femaleDogs);

        //  1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

        ArrayList<Dog2> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dogs));
        maleDogs.removeIf(p-> p.gender =='F' );

        for (Dog2 each : maleDogs) {

        }
        System.out.println(maleDogs);

        System.out.println("-----------------------------------------------");

        Dog2[] dogs2 = {new Dog2(), new Dog2(), new Dog2(), new Dog2(), new Dog2(), new Dog2()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        //creat a program that can remove all the small dogs from this array
        // the difference between array and arraylist is that the size of the array is fixed, so if you want to change the number of elements of an array is to come up with new array with the changed size of elements

        // so if we can convert the array to arraylist and do the manipulations as required

        ArrayList<Dog2> list = new ArrayList<>();
        list.addAll(Arrays.asList(dogs2));
        list.removeIf(p-> p.size.equalsIgnoreCase("small"));
        dogs2 = list.toArray(new Dog2[list.size()]);// here we are converting back the arraylist to array

        System.out.println(Arrays.toString(dogs2));




    }






    }

/*

warmup tasks:
	1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops
 */