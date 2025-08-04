package lab1package;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DurationCalcucator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date ");
        String input = scanner.nextLine();
        LocalDate date = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();
        Period duration = Period.between(date, currentDate);
    
        System.out.println("Years  : " +duration.getYears());
        System.out.println("Months : " + duration.getMonths());
        System.out.println("Days   : " +duration.getDays());

        scanner.close();
    }
}
