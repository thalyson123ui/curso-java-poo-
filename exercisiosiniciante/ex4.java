package exercisiosiniciante;
import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
       // configurar o locale para us para aceitar  pontos em vez de virgula
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       // leitura dos dados de entrada
       int numeroFuncionario = sc.nextInt();
       int horasTrabalhadas = sc.nextInt();
       double valorPorHora = sc.nextDouble();

       // calculo do salario
       double salario = horasTrabalhadas * valorPorHora;

       // impressao do resultado
       System.out.println("NUMBER = " + numeroFuncionario);
       System.out.printf("SALARY = U$ %.2f%n", salario);
       sc.close();
    }
}
