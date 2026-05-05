package exercisiosiniciante;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Leitura dos três valores
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Definição de PI conforme o enunciado
        double pi = 3.14159;

        // Cálculos das áreas
        double triangulo = (A * C) / 2.0;
        double circulo = pi * Math.pow(C, 2);
        double trapezio = ((A + B) * C) / 2.0;
        double quadrado = Math.pow(B, 2);
        double retangulo = A * B;

        // Exibição dos resultados com 3 casas decimais
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
