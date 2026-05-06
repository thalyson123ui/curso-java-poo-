package exercisiosestruturascondicionais;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("SÃO MÚLTIPLOS");
        } else {
            System.out.println("NÃO SÃO MÚLTIPLOS");
        }
        sc.close();
    }
}
