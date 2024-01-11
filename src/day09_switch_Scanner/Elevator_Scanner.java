package day09_switch_Scanner;

import java.util.Scanner;

public class Elevator_Scanner {

    public static void main(String[] args) {


        Scanner elevator = new Scanner(System.in);

        System.out.println("Enter the floor number: ");

        int floornum = elevator.nextInt();


        String result2 = "invalid floor";
        result2="Floor "+floornum+" selected. companies: ";

        if (floornum >=1 && floornum<=3){// this is pre- condition to check if the floor exists
            if(floornum==1){result2 += "Lobby, Verizon, Starbucks";
            } else if (floornum==2) {result2 +="Cydeo, NASA, Intelsat";}
            else {result2 +=" Lyft, BofA, Stake house"; }
        }

        else {result2 = "Invalid floor";}
        System.out.println(result2);
        elevator.close();




    }
}
