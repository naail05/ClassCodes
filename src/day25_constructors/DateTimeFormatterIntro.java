package day25_constructors;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {
 // we need to call DateTimeFormatter and for further use can assign it to reference variable
       // DateTimeFormatter df = DateTimeFormatter.ofPattern("y-MMMM-d-EEEE");// this will include four digits of the year
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yy");//December-13-23
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        //how if we want to include/display the month as well, then will include M for month
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime rightNow = LocalTime.now();
        System.out.println(rightNow.format(tf));

        System.out.println("----------DateTimeFormatter-------------");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MM/dd/y hh:mm a");// output will be Wednesday, 12/13/2023 09:04 PM
        //pattern used for formatting local date time object

        LocalDateTime start = LocalDateTime.now();
        System.out.println(start.format(dtf));// if we want to add something extra or more as "Date & Time: " or so, we can not add that in the pattern, instead we can add in the print statement or generally need to concatenate
        System.out.println("Date & Time: "+start.format(dtf));

    }
}
