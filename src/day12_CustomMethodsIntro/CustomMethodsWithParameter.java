package day12_CustomMethodsIntro;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        oddOrEven(10);// when we call the method, but doesnt give the number (in this case then it will give compile error, give argument, which will be assigned to the parameter already passed

        System.out.println("------------------------------------------------------");
        oddOrEven(100);// so we can use this method by just calling it as many times as we want withouth writing codes each and every time


        //in order to know whether these numbers are odd or even we simply call the method we created
        int num1 = 100;
        oddOrEven(num1);


        int num2 = 35;
        oddOrEven(num2);

        int num3 = 79;
        oddOrEven(num3);


        int num4 = 39;
        oddOrEven(num4);


        //for understandability purposes we should give/pass comments with our functions telling what this function does, as in this case the method takes an argument and verifies if the number is odd or even

        System.out.println("--------------------------------------------------------------");

        isEligibleOrNot(22);

        //the method takes an argument and verifies if the person is eligible to buy alcohol or not

        System.out.println("-------------------------------------------------------------");

        oddOrEvenOrZero(24);

        //the method takes an argument and verifies if the number is odd, even or zero


    }

    public static void oddOrEven(int number) {//we are passing parameter as its the information which is must for the function

        if (number % 2 == 0) {

            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }


    }

    //create a method that can check if a person is eligible to buy alcohol
    public static void isEligibleOrNot(int age) {

        if (age > 0 && age <= 120) {
            if (age >= 21 && age <= 120) {

                System.out.println("You are eligible to buy alcohol");
            } else {
                System.out.println("You are not eligible to buy alcohol");
            }
        } else {
            System.out.println("Invalid number");
        }
    }

    public static void oddOrEvenOrZero(int number) {
        if (number > 0 && number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println(number + " is an odd number");

        } else {
            System.out.println(number + " is zero");
        }

    }


}
