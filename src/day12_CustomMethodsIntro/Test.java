package day12_CustomMethodsIntro;

public class Test {

    public static void main(String[] args) {

//verify if the number is odd or even
        int number = 300;
        CustomMethodsWithParameter.oddOrEven(number);
        //type the name of the class in which the method is then . (dot) then the method name

        CustomMethodsWithParameter.oddOrEvenOrZero(300);

        String FirstName = "Vasyl";
        String LastName = "Dobrianski";
        Initials_withMethod.initial(FirstName,LastName);


        // the benefit of static method is that we can always call them via their class name

    }

}
