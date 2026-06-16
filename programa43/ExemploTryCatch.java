package programa43;

public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            // Tentativa de converter uma string em número
            String texto = "123a"; 
            int numero = Integer.parseInt(texto); 
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            // Tratamento da exceção
            System.out.println("Erro: não foi possível converter a string em número.");
            System.out.println("Detalhes: " + e.getMessage());
        } finally {
            // Bloco opcional que sempre é executado
            System.out.println("Finalizando execução...");
        }
    }
}
