package day10_Scanner_StringIntro;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFiles_with_Scanner {

    public static void main(String[] args) throws IOException {
        //new Scanner(System.in); this scanner object if for reading the keyboard entries(for user input)

       Scanner scan = new Scanner(Path.of("src/day10_Scanner_StringIntro/test.txt"));
       // we use the same method as in case of input, just in the place of system.in for now we use the path-of method where when we click in the parenthesis it comes up and copy and paste the path of the file we want to import, but for this we may get compile error at the second Scanner(after new) where for now we will use the suggestion (suggested solutions) and add the exception.

        System.out.println(scan.nextLine());// to read from the file we will use print statement and scan option in the () and select the intended method as next or next line or nextInt and so on
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.hasNext());// this let is us know if there is any other next line or word
        scan.close();



    }
}
