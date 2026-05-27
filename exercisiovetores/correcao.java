package exercisiovetores;

import java.util.Locale;
import java.util.Scanner;

public class correcao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        rent[] vect = new rent[10]; // 10 quartos disponíveis (0 a 9)

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the data of the " + (i + 1) + "º tenant:");
            System.out.print("Name: ");
            sc.nextLine(); // consumir quebra de linha
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room number (0-9): ");
            int room = sc.nextInt();

            if (vect[room] == null) {
                vect[room] = new rent(name, email);
            } else {
                System.out.println("Room already occupied! Choose another.");
                i--; // volta uma posição para repetir o cadastro
            }
        }

        System.out.println("\nOccupied rooms:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
