package day16_LoopsContinue_nestedLoops;

public class NestedLoopIntro {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Bashir Naail");
            //now this code fragment will be repeated for five times(as the number of i)
            //Now if we want to repeat it for five more time we can simply copy and past the same and will get five more times as:

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Bashir Naail");}


        System.out.println("--------------nested Loop-----------------------");
        //another way to do so is to create nested loop(loop inside another loop)

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                System.out.println("Bashir Naail");}// this is nested loop, one loop inside another loop, so for every cycle of the outer loop the inner loop code fragment will execute twice, like in the above case out loop will execute three times and for each time the inner loop will execute twice so total number of execution will be 6.

    }
}
