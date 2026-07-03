public class Main {

    @FunctionalInterface
    interface Calculadora {
        int calcular(int a, int b);
    }

    public static void main(String[] args) {

        // Implementação usando expressão lambda
        Calculadora soma = (a, b) -> a + b;

        Calculadora multiplicacao = (a, b) -> a * b;

        Calculadora maior = (a, b) -> {
            if (a > b) {
                return a;
            }
            return b;
        };

        System.out.println("Soma: " + soma.calcular(10, 5));
        System.out.println("Multiplicação: " + multiplicacao.calcular(10, 5));
        System.out.println("Maior número: " + maior.calcular(10, 5));
    }
}