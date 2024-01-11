package day21_Multi_dimensionalArray;

public class MultiDimensionalArrayPractice3 {

    public static void main(String[] args) {
        int[][][] arr3D1 = {{{1,2} , {3, 4, 5}}, {{6, 7, 8, 9},{10, 11},{12,13,14}}};

        int[][][] arr3D2 = {{{6, 7, 8, 9},{10, 11},{12,13,14}}, {{15, 16, 17, 18}}};

        int[][][] arr3D3 = {{{1,2} , {3, 4, 5}}, {{15, 16, 17, 18}}};

        //based on n-1, here we need to have four dimensional array

        int[][][][] arr4D = {arr3D1, arr3D2, arr3D3};
        //if we want to iterate each element from 4 dimensional we need 4 loops

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);

                    }

                }

            }


        }
    }
}
