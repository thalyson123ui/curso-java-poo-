package programa57;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer; 

public class ExemploConsumerLista {

    public static void main(String[] args) {

        List<String> alunos = Arrays.asList(
                "João",
                "Maria",
                "Carlos",
                "Ana"
        );

        Consumer<String> imprimirAluno = aluno ->
                System.out.println("Aluno: " + aluno);

        alunos.forEach(imprimirAluno);
    }
}