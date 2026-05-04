package programa4;

import java.util.Scanner;
import java.util.Locale;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String x;
        int y;
        double z;
        System.out.println("Digite uma string, um inteiro e um número decimal:");
        x = scanner.next();
        y = scanner.nextInt();
        z = scanner.nextDouble(); 
        
        System.out.println("dados digitados");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        scanner.close();
    }
}