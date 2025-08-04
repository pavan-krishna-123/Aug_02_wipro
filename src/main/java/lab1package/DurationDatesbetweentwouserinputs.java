package lab1package;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DurationDatesbetweentwouserinputs{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date1 ");
        String input1 = scanner.nextLine();
        System.out.print("Enter a date2 ");
        String input2 = scanner.nextLine();
        
        LocalDate date1 = LocalDate.parse(input1);
        LocalDate date2 = LocalDate.parse(input2);
     
        Period duration = Period.between(date1, date2);
    
        System.out.println("Years  : " +duration.getYears());
        System.out.println("Months : " + duration.getMonths());
        System.out.println("Days   : " +duration.getDays());

        scanner.close();
    }
}
