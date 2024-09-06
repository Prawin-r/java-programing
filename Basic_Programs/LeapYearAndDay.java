package Basic_Programs;
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class LeapYearAndDay {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
            LocalDate date = LocalDate.of(year, 2, 29);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.println("February 29th of " + year + " falls on a " + dayOfWeek + ".");
        } else {
            System.out.println(year + " is not a leap year. February 29th does not exist in this year.");
        }
        
        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
