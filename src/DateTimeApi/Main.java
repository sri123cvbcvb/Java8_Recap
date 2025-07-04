package DateTimeApi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDate join = LocalDate.of(2025, 7, 1);

        long days = ChronoUnit.DAYS.between(join, LocalDate.now());
        System.out.println(days);
    }
}
