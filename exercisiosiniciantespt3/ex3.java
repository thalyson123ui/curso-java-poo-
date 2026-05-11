package exercisiosiniciantespt3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        // Lê a primeira opção
        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool++;
            } else if (tipo == 2) {
                gasolina++;
            } else if (tipo == 3) {
                diesel++;
            }
            
            // Se o tipo for inválido (fora de 1, 2, 3 ou 4), 
            // o programa apenas ignora e pede o próximo valor.
            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
