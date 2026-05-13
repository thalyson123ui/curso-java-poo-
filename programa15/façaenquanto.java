package programa15;
import java.util.Locale;
import java.util.Scanner;
public class façaenquanto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("digite a temperatura em celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
            System.out.printf("a temperatura em fahrenheit é: %.1f%n", fahrenheit);
            System.out.println("deseja repetir o programa? (s/n)");
            String resposta = sc.next();
            while (resposta.equalsIgnoreCase("s")) {
                System.out.print("digite a temperatura em celsius: ");
                celsius = sc.nextDouble();
                fahrenheit = 9.0 * celsius / 5.0 + 32.0;
                System.out.printf("a temperatura em fahrenheit é: %.1f%n", fahrenheit);
                System.out.println("deseja repetir o programa? (s/n)");
                resposta = sc.next();
            }
        }
    }
}
