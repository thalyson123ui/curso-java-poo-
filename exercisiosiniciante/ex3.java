package exercisiosiniciante;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // leitura dos quatro valores inteiros
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // calculo da diferença
        int diferenca = (a * b - c * d);

        // impressao do resultado
        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }
}
