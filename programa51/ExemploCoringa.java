package programa51;

import java.util.*;

public class ExemploCoringa {

    // Usa coringa delimitado superior (? extends Number)
    // Aceita listas de qualquer tipo que herde de Number
    public static double somarLista(List<? extends Number> lista) {
        double soma = 0;
        for (Number n : lista) {
            soma += n.doubleValue();
        }
        return soma;
    }

    // Usa coringa delimitado inferior (? super Integer)
    // Aceita listas de Integer ou de supertipos (Number, Object)
    public static void adicionarInteiros(List<? super Integer> lista) {
        for (int i = 1; i <= 5; i++) {
            lista.add(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<>();
        adicionarInteiros(inteiros); // adiciona valores de 1 a 5
        System.out.println("Lista de inteiros: " + inteiros);

        List<Double> doubles = Arrays.asList(2.5, 3.5, 4.5);
        System.out.println("Soma dos doubles: " + somarLista(doubles));

        System.out.println("Soma dos inteiros: " + somarLista(inteiros));
    }
}
