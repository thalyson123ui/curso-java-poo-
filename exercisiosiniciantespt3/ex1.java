package exercisiosiniciantespt3;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int senhacorreta = 2002;

       //primeira leitura da senha
         int senhadigitada = sc.nextInt();

         // o laço continua enquanto a senha digitada for diferente da senha correta
         while (senhadigitada != senhacorreta) {
             System.out.println("Senha Invalida");
             //leitura da senha novamente
             senhadigitada = sc.nextInt();
         }
         System.out.println("Acesso Permitido");

            sc.close();
    }
}
