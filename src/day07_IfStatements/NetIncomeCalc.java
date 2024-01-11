package day07_IfStatements;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary = 100_000;
        double taxRate = 0;//assign temporary value

        boolean isMarried = true;


        if (salary>=130000) {taxRate= 0.35;}//use for calculating the tax rate
        if (salary>=100000 && salary<130000) {taxRate= 0.30;}

        if (salary>=80000 && salary<100000) {taxRate= 0.25;}

        if (salary<80000) {taxRate= 0.20;}

        if(isMarried){taxRate-=.05;} // if the person is married then tax is redueced by %5

        double netIncome = salary*(1-taxRate);


        System.out.println(netIncome);//now we only need one print statement



    }
}
/*

Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129.99k
                        25% for salary of 80K to 99.99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax
 */