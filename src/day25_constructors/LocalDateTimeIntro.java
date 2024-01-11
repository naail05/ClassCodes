package day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);//2023-12-13T17:42:30.597607 this is the default format, which we can format later on

       LocalDateTime ends = LocalDateTime.of(2013,12,28,11,10);
        System.out.println(ends);

        System.out.println("---------calling methods of localDat/Time-------");
        System.out.println(starts.getDayOfWeek());

        System.out.println(starts.getMonth());








    }
}
