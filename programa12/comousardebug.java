package programa12;
import java.util.Locale;
import java.util.Scanner;
public class comousardebug {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;
        do {
            System.out.print("digite a temperatura em celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("a temperatura em fahrenheit é: %.2f%n", fahrenheit);
            System.out.print("deseja repetir o processo? (s/n): ");
            resposta = sc.next().charAt(0);
        }while (resposta == 's' || resposta == 'N');

        sc.close();
    }
}