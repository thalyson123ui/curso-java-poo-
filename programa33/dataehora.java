package programa33;

import java.time.LocalDate;
import java.time.LocalTime;

public class dataehora {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalTime h01 = LocalTime.now();
        LocalTime h02 = LocalTime.of(12, 30, 45);

        System.out.println("data atual: " + d01);
        System.out.println("hora atual: " + h01);
        System.out.println("hora especificada: " + h02);
    }
}
