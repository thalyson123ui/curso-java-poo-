package programa54;

import java.util.Objects;

class Produto {

    private String codigo;
    private String nome;

    public Produto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Produto outro = (Produto) obj;

        return Objects.equals(codigo, outro.codigo) &&
               Objects.equals(nome, outro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome);
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Nome: " + nome;
    }
}