package programa24;

// Classe com encapsulamento
public class encapsulamento {
    // Atributos privados (não podem ser acessados diretamente fora da classe)
    private String nome;
    private int idade;

    // Construtor
    public encapsulamento(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

    // Setter para idade
    public void setIdade(int idade) {
        if (idade >= 0) { // regra de validação
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    // Método para exibir informações
    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
