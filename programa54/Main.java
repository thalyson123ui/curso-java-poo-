package programa54;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Produto> produtos = new HashSet<>();

        produtos.add(new Produto("001", "Notebook"));
        produtos.add(new Produto("002", "Mouse"));
        produtos.add(new Produto("003", "Teclado"));

        // Produto repetido
        produtos.add(new Produto("001", "Notebook"));

        System.out.println("Produtos cadastrados:\n");

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("\nQuantidade de produtos: " + produtos.size());
    }
}