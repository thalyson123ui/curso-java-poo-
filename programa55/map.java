package programa55;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
         // Criando um Map
        Map<String, Double> notas = new HashMap<>();

        // Adicionando elementos
        notas.put("João", 8.5);
        notas.put("Maria", 9.7);
        notas.put("Pedro", 7.8);
        notas.put("Ana", 10.0);

        // Exibindo o Map
        System.out.println("=== Lista de Notas ===");
        System.out.println(notas);

        // Buscando um valor pela chave
        System.out.println("\nNota da Maria: " + notas.get("Maria"));

        // Atualizando um valor
        notas.put("Pedro", 8.9);

        // Removendo um elemento
        notas.remove("João");

        // Verificando se existe uma chave
        System.out.println("\nExiste a chave Ana? " + notas.containsKey("Ana"));

        // Verificando se existe um valor
        System.out.println("Existe a nota 10.0? " + notas.containsValue(10.0));

        // Percorrendo o Map
        System.out.println("\n=== Alunos e Notas ===");
        for (Map.Entry<String, Double> aluno : notas.entrySet()) {
            System.out.println(aluno.getKey() + " -> " + aluno.getValue());
        }

        // Tamanho do Map
        System.out.println("\nQuantidade de alunos: " + notas.size());
    }
}
