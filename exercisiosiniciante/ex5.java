package exercisiosiniciante;
import java.util.Locale;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
       // Garante que o separador decimal seja o ponto (.)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Dados da Peça 1
        sc.nextInt();
        int qte1 = sc.nextInt();
        double preco1 = sc.nextDouble();

        // Dados da Peça 2
        sc.nextInt();
        int qte2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        // Cálculo do total
        double total = (qte1 * preco1) + (qte2 * preco2);

        // Saída formatada
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
        
}
