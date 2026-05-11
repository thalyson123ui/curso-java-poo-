package exercisiosiniciantespt3;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        // Leitura inicial das coordenadas
        int x = sc.nextInt();
        int y = sc.nextInt();

        // O laço continua enquanto X e Y forem diferentes de zero
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

            // Lê os próximos valores para a nova iteração
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
