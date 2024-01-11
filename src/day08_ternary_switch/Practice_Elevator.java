package day08_ternary_switch;

public class Practice_Elevator {

    public static void main(String[] args) {

        int floorNumber = 2;
        String result = "invalid floor";
        if (floorNumber >=1 && floorNumber<=3){// this is pre- condition to check if the floor exists
            if(floorNumber==1){result= "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floorNumber==2) {result="Floor 2 selected. Companies: Cydeo, NASA, Intelsat";}
            else {result="Floor 3 selected. Companies: Lyft, BofA, Stake house"; }
        }

            else {result = "Invalid floor";}// we can even remove this else block by giving its value to the String variable as when the pre-condition is false then the else block will get executed
        System.out.println("result = " + result);
        // to optimize the above can be also be done as follow :

        System.out.println("-------------------------------------------");


        int floorNumber2 = 2;
        String result2 = "invalid floor";
        result2="Floor "+floorNumber2+" selected. companies: ";

        if (floorNumber2 >=1 && floorNumber2<=3){// this is pre- condition to check if the floor exists
            if(floorNumber2==1){result2 += "Lobby, Verizon, Starbucks";
            } else if (floorNumber2==2) {result2 +="Cydeo, NASA, Intelsat";}
            else {result2 +=" Lyft, BofA, Stake house"; }
        }

        else {result2 = "Invalid floor";}
        System.out.println(result2);


        }



    }

/*

Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"
 */