package exercisiosiniciante;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // leitura do valor do raio
        double raio = sc.nextDouble();

        // valor de pi
        double pi = 3.14159;

        // calculo da area do circulo
        double area = pi * Math.pow(raio, 2);

        // exibição do resultado
        System.out.printf("AREA = %.4f%n", area);

        sc.close();
    }
}
