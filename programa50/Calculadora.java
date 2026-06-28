package programa50;

// Classe utilitária com método genérico
public class Calculadora {

    // Método genérico que aceita apenas tipos que estendem Number
    public static <T extends Number> double somar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    // Método genérico que aceita apenas tipos que implementam Comparable
    public static <T extends Comparable<T>> T maior(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }

    public static void main(String[] args) {
        // Exemplo com números
        System.out.println("Soma: " + somar(10, 20));          // int
        System.out.println("Soma: " + somar(5.5, 3.2));        // double

        // Exemplo com strings (Comparable)
        System.out.println("Maior: " + maior("banana", "abacaxi"));

        // Exemplo com números (Comparable também funciona)
        System.out.println("Maior: " + maior(42, 27));
    }
}
