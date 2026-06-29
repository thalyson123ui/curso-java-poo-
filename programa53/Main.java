package programa53;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 1001);
        Aluno aluno2 = new Aluno("João", 1001);
        Aluno aluno3 = new Aluno("Maria", 1002);

        // Testando equals
        System.out.println("aluno1.equals(aluno2): " + aluno1.equals(aluno2));
        System.out.println("aluno1.equals(aluno3): " + aluno1.equals(aluno3));

        // Testando hashCode
        System.out.println("\nHashCode aluno1: " + aluno1.hashCode());
        System.out.println("HashCode aluno2: " + aluno2.hashCode());
        System.out.println("HashCode aluno3: " + aluno3.hashCode());

        // Testando HashSet
        HashSet<Aluno> alunos = new HashSet<>();

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        System.out.println("\nQuantidade de alunos no HashSet: " + alunos.size());
    }
}