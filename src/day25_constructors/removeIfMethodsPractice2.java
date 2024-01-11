package day25_constructors;

import day17_ClassAndObjectIntro.Dog2;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfMethodsPractice2 {


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
        for (Dog2 each : dogs) {
           if( each.size.equals("Small")){
               smallDogs.add(each);
            }

        }
        System.out.println(smallDogs);
        System.out.println("-------------------------------------------------------");
//Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList
        ArrayList<Dog2> youngDogs = new ArrayList<>();
        for (Dog2 each : dogs) {
            if( each.age<=4){
                youngDogs.add(each);
            }

        }
        System.out.println(youngDogs);

        System.out.println("-------------------------------------------------------");

        //Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList
        ArrayList<Dog2> femaleDogs = new ArrayList<>();
        for (Dog2 each : dogs) {
            if( each.gender=='F'){
                femaleDogs.add(each);
            }

        }
        System.out.println(femaleDogs);

        System.out.println("-------------------------------------------------------");

        //1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

        ArrayList<Dog2> maleDogs = new ArrayList<>();
        for (Dog2 each : dogs) {
            if( each.gender=='M'){
                maleDogs.add(each);
            }

        }
        System.out.println(maleDogs);

    }




}

