package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        int[] array = new int [5];//means {0,0,0,0,0} for now

        array[0] = 10;// here index zero will be updated{10,0,0,0,0}
        array[1] =20;//{10,20,0,0,0}
        array[2] = 30;//{10,20,30,0,0}
        array[2] = 30;//{10,20,30,40,0}
        // though we assigned only two elements to this array but still this array will have 5 elements where two will be these and remaining three will be default value which is zero in this case

        System.out.println(Arrays.toString(array));
        System.out.println("-----------------------Arraylist------------------");
        ArrayList <String> students = new ArrayList<>();// creating Arraylist
        // primitives are not supported by arraylist, so if we want primitive data type we need to use their wrapper class

        System.out.println(students);// directly pass the arraylist into the print statement and it will be printed, no need to call toString or so

        System.out.println(students.size());// this method will till us about the arraylist list, where for now its zero


    }

}
