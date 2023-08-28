import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TuesdayCounter {
    public static void main(String[] args) {
        // Enter the date of birth in yyyy-MM-dd format
        LocalDate dateOfBirth = LocalDate.of(2000, 1, 1);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Count the number of Tuesdays
        int tuesdayCount = countTuesdays(dateOfBirth, currentDate);

        System.out.println("Number of Tuesdays between " + dateOfBirth + " and " + currentDate + ": " + tuesdayCount);
    }

    private static int countTuesdays(LocalDate startDate, LocalDate endDate) {
        int totalDays = (int) ChronoUnit.DAYS.between(startDate, endDate);
        int[] daysOfWeekCount = new int[7];

        for (int i = 0; i <= totalDays; i++) {
            LocalDate currentDate = startDate.plusDays(i);
            DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
            int dayOfWeekValue = dayOfWeek.getValue() % 7; // Normalize to index 0-6

            daysOfWeekCount[dayOfWeekValue]++;
        }

        return daysOfWeekCount[DayOfWeek.TUESDAY.getValue() % 7];
    }
}