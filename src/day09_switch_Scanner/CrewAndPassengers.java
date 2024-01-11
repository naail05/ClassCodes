package day09_switch_Scanner;

public class CrewAndPassengers {

    public static void main(String[] args) {

        int numberOfPeople = 100;


        String result =  (numberOfPeople==50 || numberOfPeople==75 ||numberOfPeople==100 )?
                (numberOfPeople==50) ? "20 crew, 30 passengers" :(numberOfPeople==75) ? "25 crew, 50 passengers" :"30 crew, 70 passengers" : "Not valid";

        System.out.println(result);

        System.out.println("----------------with switch statement--------------------");


        String outcome = "";


        switch (numberOfPeople){

            case 50:
                outcome = "20 crew, 30 passengers";
                break;

            case 75:
                outcome = "25 crew, 50 passengers";
                break;

            case 100:
                outcome = "30 crew, 70 passengers";
                break;

            default:
                outcome = "Not valid";

        }
        System.out.println(outcome);



    }
}
/*
Create a class named CrewAndPassengers
		Given a number of people on the ship (int number)
		determine how many need to be crew members and how many can be passengers.
		Print how many of each type there should be.

                Total: 50  ====> 20 crew, 30 passengers
                Total: 75  ====> 25 crew, 50 passengers
                Total: 100 ====> 30 crew, 70 passengers
                Any other number of people on the ship is not valid

                Solution1: Use ternary. Do not use more than one println()
                Solution2: Use switch statement. Do not use more than one println()

 */