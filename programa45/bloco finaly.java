package programa45;

class ExemploFinally {
    public static void main(String[] args) {
        try {
            // Tentando abrir um recurso (simulação)
            System.out.println("Abrindo recurso...");
            
            // Forçando uma exceção
            int resultado = 10 / 0; 
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero.");
        } finally {
            // Sempre será executado
            System.out.println("Fechando recurso (finally).");
        }
    }
}
