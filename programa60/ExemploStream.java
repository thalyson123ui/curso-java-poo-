package programa60;

import java.util.Arrays;
import java.util.List;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos";
    }
}

public class ExemploStream {

    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 17),
                new Pessoa("Carlos", 25),
                new Pessoa("Mariana", 30),
                new Pessoa("Pedro", 15),
                new Pessoa("João", 20)
        );

        System.out.println("Pessoas maiores de idade:");

        pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() >= 18)
                .sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
                .map(Pessoa::getNome)
                .forEach(System.out::println);
    }
}