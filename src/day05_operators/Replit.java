package day05_operators;

public class Replit {

    public static void main(String[] args) {


        String firstName = "Noah", lastName = "Smith", companyName = "Apple";
        int salary = 200_000;
        byte startDay = 10, startMonth = 1;
        int startYear = 2022;
        boolean fullTime = true;
        String officeAddress = "One Apple Park Way, Cupertino, CA 95014";
        boolean Is_FULL_TIME= true;

        String fullname = firstName+" "+lastName;
        String fullStartDate = startMonth+"/"+startDay+"/"+startYear;
        String email = firstName+startDay+"@"+companyName+".com";
        int salaryAfter2Years = salary+salary*15/100;

        String EmployeeInformation = "We have "+fullname+" joining "+companyName+"\n"+firstName +" will start on "+fullStartDate+" as full time: "+ Is_FULL_TIME+"\n"+firstName+" here is some information about your employment"+"\nYour email is "+email+"\nYour base salary is $"+salary+" and after 2 years it will be $"+salaryAfter2Years+"\nWelcome aboard, see you at "+officeAddress;

        System.out.println("Employee Information"+"\n"+EmployeeInformation);

    }
}
