package exercisiosestruturascondicionais;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto = 0.0;

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (salario > 4500.00) {
                imposto += (salario - 4500.00) * 0.28;
                salario = 4500.00;
            }
            if (salario > 3000.00) {
                imposto += (salario - 3000.00) * 0.18;
                salario = 3000.00;
            }
            if (salario > 2000.00) {
                imposto += (salario - 2000.00) * 0.08;
            }

            System.out.printf("R$ %.2f\n", imposto);
        }

        sc.close();
    }
}
