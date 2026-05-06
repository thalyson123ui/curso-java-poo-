package exercisiosestruturascondicionais;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;

        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
            default:
                total = 0.0;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
