package programa58;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
public class function {
    public static void main(String[] args) {
        Map<String, Double> produtos = new HashMap<>();

        produtos.put("notebook", 4500.00);
        produtos.put("mouse", 150.00);
        produtos.put("teclado", 250.00);
        produtos.put("monitor", 900.00);

        // aplica 10% de desconto
        Function<Double, Double> aplicarDesconto = valor -> valor * 0.9;
        
        System.out.println("Produtos com desconto:");
        for (Map.Entry<String, Double> produto : produtos.entrySet()) {
            String nomeProduto = produto.getKey();
            Double precoOriginal = produto.getValue();
            Double precoComDesconto = aplicarDesconto.apply(precoOriginal);

            System.out.println(nomeProduto + ": R$ " + precoComDesconto);
        }
    }
}
