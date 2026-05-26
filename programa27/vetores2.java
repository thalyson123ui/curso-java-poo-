package programa27;

import java.util.Locale;
import java.util.Scanner;

public class vetores2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        products[] vect = new products[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Consume the newline character
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new products(name, price);
        }
        System.out.println("Products:");
        for (int i = 0; i < n; i++) {
            System.out.println(vect[i].getName() + ", " + vect[i].getPrice());
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("Average Price: %.2f%n", avg);
        sc.close();
    }
}
