package programa29;
import java.util.ArrayList;

public class lacoforeach {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
