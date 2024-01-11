package day15_whil_LoopsContinue;

public class BreakStatement {

    public static void main(String[] args) {// for break statement you should have either a switch or loop otherwise break statement can not be used

        for (int i = 0; i < 10; i++) {// now in normal case this loops gets executed 10 times (0 to 9 so total of 10 cycles)

            if(i==6){break;}// this break exits/terminates the loop as i reaches 6
            System.out.println(i);}


            System.out.println("-------------------------------------------------");

            for (char i = 'A'; i <'Z' ; i++) {

                //if(i=='M'){break ; } if we give the break statement before tha print statement then the condition in the break statement (eg m in this case) will not be executed means will not be included and printed and loop ap will exit/terminated when reaches that condition
                System.out.println(i);
                if (i == 'M') {
                    break;
                } //if we give the break statement after tha print statement then the condition in the break statement (eg m in this case) will  be executed means will  be included and printed and after that the loop will exit/terminated
            }

                // break statement even terminates infinite loop

                for(;;){
                    System.out.println("Hello world");
                    break;// this break statement terminates this infinite loop which was to continue infinitely if there was no break
                    // also need to mention that when we are giving break statement in a block then whatever code fragment we have, we should give it before the break statement in the block else it will be unreachable.

                }


            }


            
        }


        


