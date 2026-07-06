package programa61;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Produto {
    private String nome;
    private String categoria;
    private double preco;

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}

public class ExemploPipeline {

    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", "Eletrônicos", 4500),
                new Produto("Mouse", "Eletrônicos", 120),
                new Produto("Monitor", "Eletrônicos", 900),
                new Produto("Cadeira Gamer", "Móveis", 1300),
                new Produto("Teclado", "Eletrônicos", 250)
        );

        List<String> resultado = produtos.stream()      // Fonte
                .filter(p -> p.getPreco() > 200)        // Filtra
                .filter(p -> p.getCategoria().equals("Eletrônicos"))
                .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .map(Produto::getNome)                  // Transforma em String
                .collect(Collectors.toList());          // Operação terminal

        System.out.println("Produtos encontrados:");

        resultado.forEach(System.out::println);
    }
}