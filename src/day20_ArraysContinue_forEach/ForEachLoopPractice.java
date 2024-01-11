package day20_ArraysContinue_forEach;

public class ForEachLoopPractice {

    public static void main(String[] args) {

       //getting odd number by using for loop
        int odd = 0;

        int[] numbers = {1, 3, 2, 4,5,11, 7, 8, 10, 9, 6};
        for (int i = 1; i <numbers.length+1 ; i++) {
            if(i%2==0){
                continue;
            }else {odd=i;}

            System.out.println(odd);}


// now will use for each loop to get ood numbers
        int[] number = {1, 3, 2, 4,5,11, 7, 8, 10, 9, 6};
        //the shortcut for for-each is variable name+for
        for (int each : number) {
            if(each%2!=0){

            System.out.println(each);}

        }


        System.out.println("-----------max and min with for each loop-----");
    int[] nums = {100, 20, 30, 40, 5, 4, 3, 1, 2, 1000, 300, 5000};
    int max = nums[0];
        int min =nums[0];

        for (int each : nums) {
            if(each>max){
                max=each;
            }if(each<min){
                min= each;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);



    }
}
