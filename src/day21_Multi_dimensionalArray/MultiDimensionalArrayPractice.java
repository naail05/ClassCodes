package day21_Multi_dimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {


    String[] group1 = { "Ahmad", "Khalid", "Omid", "Jamal"};
    String[] group2 = {"Nazir ", "Rashid ", "Maryam"};
    String[] group3 = {"Ajmal","Abid", "Waris","Hasan", "Bilal"};
    String[] group4 = {"Adelina", "Ali"};

    //Store all the groups into the 2-dimensional array
    String[][] groups ={group1,group2,group3,group4};

    //now need to iterate each group and then each student in the group

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];

                System.out.println(eachStudent);

            }

        }
        System.out.println("------using for each loop-----------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);

            }

        }
        System.out.println("------reverse order-----------");
        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup =groups[i];
            System.out.println(Arrays.toString(eachGroup));
            //first we will get each group in the reverse order using for loop
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
                //after we got each group in the reverse order we will use to access each element using for each loop
            }

        }
        System.out.println(Arrays.deepToString(groups));
        //to print multi-dimensional array, we need to use deepToString instead of toString

}

}
