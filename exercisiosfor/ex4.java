package exercisiosfor;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = x / y;
                System.out.printf("%.1f%n", divisao);
            }
        }

        sc.close();
    }
}