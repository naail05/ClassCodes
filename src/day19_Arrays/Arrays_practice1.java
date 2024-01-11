package day19_Arrays;

import java.util.Arrays;

public class Arrays_practice1 {
    public static void main(String[] args) {

        String [] myGroup   = new String [5];
        myGroup [0] = "Gulcin";
        myGroup [myGroup.length-1] ="Aseel";
        myGroup[2] = "Sumeye";
        myGroup[1] = "Abidullah";
        myGroup[3] = "Khashayar";

        System.out.println(Arrays.toString(myGroup));

        //lets suppose one group member was shifted to another group, so can we update that?

        myGroup [1]= "Kuzzat";
        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------reverse-------------------------------------");

        for (int i = (myGroup.length-1); i >=0; i--) {
            //System.out.print(" "+myGroup[i]+" "); to have them on the same line with spaces between them

            System.out.println(myGroup[i]);


        }

        System.out.println("--------------iterating Array by using for loop---------------------");

        for (int i = 0; i < myGroup.length; i++) {//call the name of array and then dot then fori
            //for reverse type the name then dot them forr

            for (int i1 = myGroup.length - 1; i1 >= 0; i1--) {



            }System.out.println(myGroup[i]);

        }


    }









}
