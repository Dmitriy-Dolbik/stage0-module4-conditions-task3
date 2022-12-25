package school.mjc.stage0.conditions.task3;

import java.time.Month;

public class DaysInMonthPrinter {
    public static void main(String[] args) {
        DaysInMonthPrinter daysInMonthPrinter = new DaysInMonthPrinter();
        daysInMonthPrinter.amountOfDays(6);
    }
    public void amountOfDays(int month) {
        if (12 > month && month > 0){
            System.out.println(Month.of(month).maxLength());
        } else {
            System.out.println("wrong number!");
        }
    }
}
