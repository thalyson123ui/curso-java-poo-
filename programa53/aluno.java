package programa53;

import java.util.Objects;

class Aluno {

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object obj) {

        // Verifica se é o mesmo objeto
        if (this == obj) {
            return true;
        }

        // Verifica se o objeto é nulo ou de classe diferente
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Faz o cast
        Aluno outro = (Aluno) obj;

        // Compara os atributos
        return matricula == outro.matricula &&
               Objects.equals(nome, outro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula);
    }
}