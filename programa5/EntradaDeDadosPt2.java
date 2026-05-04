package programa5;

import java.util.Scanner;
import java.util.Locale;

public class EntradaDeDadosPt2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        System.out.println("Você digitou:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        scanner.close();
    }
}
