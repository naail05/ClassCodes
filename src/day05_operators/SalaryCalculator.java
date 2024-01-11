package day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 55;//here the original is int, so there is implicit casting
        double weeklyHours = 45;//can include integers and decimal
        double stateTaxRate = 7;//as they are percentage
        double federalTaxRate = 24.5 ;

        //-----------------------------------------------------------


        double salaryBeforeTax = hourlyRate*weeklyHours*52;
        double FederalTax =  (salaryBeforeTax*federalTaxRate/100);
        double  stateTax = salaryBeforeTax*stateTaxRate/100;
        double totalTax = FederalTax+stateTax;
        double salaryAfterTax = salaryBeforeTax-totalTax;
        System.out.println();
        System.out.println("\tGross pay is: $"+salaryBeforeTax);
        System.out.println("\tFederal tax is: $"+FederalTax);
        System.out.println("\tState tax is: $"+stateTax);
        System.out.println("\tTotal tax is $"+totalTax);
        System.out.println("\tNet income is: $"+salaryAfterTax);
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("Gross pay is: $"+salaryBeforeTax+
                "\nFederal tax is: $"+FederalTax+
                "\nState tax is: $"+ stateTax+
                "\nTotal tax is $"+totalTax+
                "\nNet income is: $"+salaryAfterTax);




    }
}

/*

Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560

 */