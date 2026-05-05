package exercisiosiniciante;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // leitura dos dois valores inteiros
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // calculo da soma
        int SOMA = A + B;

        // exibição do resultado
        System.out.println("SOMA = " + SOMA);

        sc.close();
    }
}
