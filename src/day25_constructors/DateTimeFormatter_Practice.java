package day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Practice {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");

        LocalDateTime festivalEnd = LocalDateTime.of(2020,11,24,13,0);
        System.out.println(festivalEnd.format(dtf));



    }
}
/*
        use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
         */