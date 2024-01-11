package day36_polymorphism_continue;

import day30_InheritanceContinue.phone.IPhone;
import day30_InheritanceContinue.phone.Nokia;
import day30_InheritanceContinue.phone.Phone;
import day30_InheritanceContinue.phone.Samsung;

import java.util.Arrays;

public class PolymorphismPractice {

    public static void main(String[] args) {
        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", 900, "Black"),
                new IPhone("Iphone 12 Pro Max", "Large", 1200, "Black"),
                new IPhone("Iphone 9", "Medium", 800, "Gold"),
                new Samsung("Galaxy S19", "Medium", 700, "Pink"),
                new Samsung("Galaxy S20", "Large", 850, "Silver"),
                new Samsung("Galaxy S21", "Large", 950, "Silver"),
                new Nokia("XR20", "Small", 350, "Gold"),
                new Nokia("G10", "Medium", 99, "White"),
                new Nokia("G50", "Large", 250, "Silver"),
                new IPhone("Iphone 12 Pro", "Large", 1200, "Black"),
                new IPhone("Iphone 11 Pro Max", "Large", 1100, "Silver"),
                new Samsung("Galaxy S18", "Medium", 750, "White"),
                new Samsung("Galaxy S17", "Large", 650, "Silver"),
                new Nokia("G10", "Medium", 99, "Black"),
                new IPhone("Iphone 6", "Small", 99, "Gold"),
                new IPhone("Iphone 7", "Small", 99, "White")
        };

        for (Phone phone : phones) {
            //print the model, color and price of each phone object in the following format
            //    				model - color - price
            System.out.println(phone.getModel() + " - " + phone.getColor() + " - " + phone.getPrice());
        }
        System.out.println("---------------------------------------------------");


        int IphoneCount = 0, SamsungCount = 0;
        for (Phone phone : phones) {
            if (phone instanceof IPhone) {//	How many Iphone in the array of phones?
                IphoneCount++;
            }
            if (phone instanceof Samsung) {   //	3. How many Samsung in the array of phones?;
                SamsungCount++;
            }

        }
        System.out.println("Iphone Count = " + IphoneCount);
        System.out.println("Samsung Count = " + SamsungCount);


        System.out.println("--------------------------------------------------------");
        for (Phone phone : phones) {
            if (phone instanceof Samsung && phone.getPrice() >= 700) {
                System.out.println(phone.getModel());
            }
            if (phone instanceof IPhone && phone.getPrice() >= 700) {
                System.out.println(phone.getModel());
            }

        }
        System.out.println("------------------Second Solution------------------------------------");
        for (Phone phone : phones) {
            if (phone instanceof Samsung || phone instanceof IPhone){
                if (phone.getPrice()>= 700){
                    System.out.println(phone.getModel());
                }
            }}



    }
}
/*
Given the following array:
		Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Red", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };


    1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater
 */