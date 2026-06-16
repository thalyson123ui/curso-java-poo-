package programa44;

public class ExemploStackTrace {
    public static void main(String[] args) {
        try {
            metodoA();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro!");
            e.printStackTrace(); // imprime a pilha de chamadas
        }
    }

    public static void metodoA() {
        metodoB();
    }

    public static void metodoB() {
        metodoC();
    }

    public static void metodoC() {
        // Forçando uma exceção
        int resultado = 10 / 0; // ArithmeticException
        System.out.println("Resultado: " + resultado);
    }
}
