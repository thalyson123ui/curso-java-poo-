package programa49;

// Classe genérica
class Caixa<T> {
    private T conteudo;

    public void guardar(T item) {
        this.conteudo = item;
    }

    public T abrir() {
        return conteudo;
    }
}

// Exemplo de uso
public class ExemploGenerics {
    public static void main(String[] args) {
        // Caixa para String
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.guardar("Olá, mundo!");
        System.out.println("Conteúdo da caixa de texto: " + caixaDeTexto.abrir());

        // Caixa para Integer
        Caixa<Integer> caixaDeNumero = new Caixa<>();
        caixaDeNumero.guardar(42);
        System.out.println("Conteúdo da caixa de número: " + caixaDeNumero.abrir());

        // Caixa para Double
        Caixa<Double> caixaDeDecimal = new Caixa<>();
        caixaDeDecimal.guardar(3.14);
        System.out.println("Conteúdo da caixa de decimal: " + caixaDeDecimal.abrir());
    }
}
