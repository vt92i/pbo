import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    Circle C1 = new Circle(12);
    Cube C2 = new Cube(5);

    ShapePrinter printer = new ShapePrinter();

    printer.print(C1);
    System.out.println();
    printer.print(C2);
    System.out.println();

    printer.printJSON(C1);
    System.out.println();
    printer.printJSON(C2);
    System.out.println();

//    LocalDate
    LocalDate date1 = LocalDate.of(2002, 7, 11);
    LocalDate date2 = LocalDate.now();
//    Compare
//    System.out.println("[ LocalDate 1 ]");
//    System.out.println(date1);
//    System.out.println("[ LocalDate 2 ]");
//    System.out.println(date2);
//    System.out.println("[ Compare ]");
//    System.out.println("Difference in years: " + (date2.getYear() - date1.getYear()) + " years");
//    System.out.println("Difference in months: " + (date2.getMonthValue() - date1.getMonthValue()) + " months");
    Duration duration = Duration.between(date1.atStartOfDay(), date2.atStartOfDay());
    System.out.println("Difference in days: " + duration.toDays() + " days");

    System.out.println("[ Calendar 1 ]");
    Calendar c1 = Calendar.getInstance();
    c1.set(2002, Calendar.JULY, 11);
    System.out.println(c1.getTime());

    System.out.println("[ Calendar 2 ]");
    Calendar c2 = Calendar.getInstance();
    System.out.println(c2.getTime());

    System.out.println("[ Compare ]");
//    double rawDiffInDays = (double) (c2.getTimeInMillis() - c1.getTimeInMillis()) / (24 * 60 * 60 * 1000);
    double rawDiffInDays = duration.toDays();

    double diffInYears = rawDiffInDays / 365.25;
    double diffInMonths = rawDiffInDays % 365.25 / 30.44;
    double diffInDays = rawDiffInDays % 365.25 % 30.44;

    System.out.printf("%.0f years %.0f months %.0f days %n", diffInYears, diffInMonths, diffInDays);
//    System.out.println("Difference in years: " + diff / (365.25 * 24 * 60 * 60 * 1000) + " years");
//    System.out.println("Difference in months: " + diff / (30.44 * 24 * 60 * 60 * 1000) + " months");
//    System.out.println("Difference in days: " + diff / (24 * 60 * 60 * 1000) + " days");
//    System.out.println("Difference in hours: " + diff / (60 * 60 * 1000) + " hours");
//    System.out.println("Difference in minutes: " + diff / (60 * 1000) + " minutes");
//    System.out.println("Difference in seconds: " + diff / (1000) + " seconds");
  }
}
