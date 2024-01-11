package day24_DateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {
        // want to get the current date
        LocalDate today =LocalDate.now();// this will return us local date object(today's date)

        System.out.println("today = " + today);//2023-12-12 , this is the default format for the date

        //how if we want to a specific date as birthday

        LocalDate birthday = LocalDate.of(1999,04,30);
        System.out.println("birthday = " + birthday);//1987-06-01 his is the default format for the specified date as birthday in this case
        //for the LocalDate.of method we have to give the required information for year, month and day and those information (arguments) need to be valid (as maxim 12 for the month, maximum 31 days in a month and the year can not be negative else will cause error(exception. DateTimeException) also need to mention that the days should be according to the month as February can not be 30 days

        System.out.println("-----------------------------------------");

        // after creating the LocalDate object we can use LocalDate methods

        System.out.println(today.getYear());// this will return the curren year 2023 in this year, as this gives us the current date

        System.out.println(today.getMonth());// will return the current month
        System.out.println(today.getMonthValue());// this will return the number of month as 12 for now (December)

        System.out.println(today.getDayOfWeek());// this will return the current day of the week
        System.out.println(birthday.getDayOfWeek());// this will return what day was the birthday(from the birthday variable we created earlier)

        System.out.println(today.getDayOfMonth());// this will return the number of the day as today is 12th so it will return day number of the month which is 12

        System.out.println(today.getDayOfYear());// will return day number of the year which is 346th day of the year as of today

        System.out.println("----------------------------------------------");

        System.out.println(birthday.plusYears(24).getDayOfWeek());

        System.out.println("----------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);
        // lets say the graduation date is delayed by two years, then n how to update it here
        graduationDate= graduationDate.plusYears(2);// so if we want the old graduation date to have reference to this new date then we will assign graduation date to this one, else that will still refer to the original date
        System.out.println("graduationDate = " + graduationDate);

        //now how if the graduation date is delayed by 7 more months

        graduationDate= graduationDate.plusMonths(7);

        System.out.println("graduationDate = " + graduationDate);

        //now what if the graduation date is delayed by 7 more weeks

        graduationDate = graduationDate.plusWeeks(7);
        System.out.println("graduationDate = " + graduationDate);

        //now what if the graduation date is delayed by 100 more days
        graduationDate = graduationDate.plusDays(100);
        System.out.println("graduationDate = " + graduationDate);

        System.out.println("---------------------now subtracting ---------------");

        LocalDate yourBirthday = LocalDate.of(2005, 4, 1);
        System.out.println("yourBirthday = " + yourBirthday);
        //Now lets suppose that this is your birthday and your older brother is born two years and 3 months before this date, now how to calculate his birthday
        LocalDate yourBrothersBirthday = yourBirthday.minusYears(2).minusMonths(3);
        System.out.println("yourBrotherBirthday = " + yourBrothersBirthday);

        System.out.println("---------------methods for comparison -------------");
        ///1) isEqual method
      // lets verify if both are born on the same date
        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,6,7);
        boolean result = birthday1.isEqual(birthday2);
        System.out.println("result = " + result);

        System.out.println("-----------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023,12,12);
        //lets verify if the graduation date before or after a certian date
        boolean result1 = grad_date.isBefore(LocalDate.of(2022, 12,31));
        System.out.println("result1 = " + result1);

        //lets verify if the graduation date before or after a certian date
        System.out.println(grad_date.isAfter(LocalDate.of(2022, 12,30)));


        System.out.println("--------------isLeapYear----------- --------");
        //leap year means February har 29 days

        System.out.println(LocalDate.of(2023,12,12).isLeapYear());















    }
}
