package programa14;
import java.util.Scanner;
public class estruturafor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("A soma dos " + n + " valores é: " + soma);
        sc.close();
    }
}
