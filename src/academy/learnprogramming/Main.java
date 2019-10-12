package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        MinutesYearsDays.printYearsAndDays(525600);
        MinutesYearsDays.printYearsAndDays(1051200);
        MinutesYearsDays.printYearsAndDays(561600);
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 1999));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2000));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(8, 1976));
    }
}