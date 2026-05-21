package programa23;

// Classe que demonstra os construtores
class Carro {
    String modelo;
    int ano;
    double preco;
    
    // 1. Construtor padrão - sem parâmetros
    public Carro() {
        this.modelo = "Padrão";
        this.ano = 2020;
        this.preco = 0.0;
    }
    
    // 2. Construtor com 1 parâmetro
    public Carro(String modelo) {
        this.modelo = modelo;
        this.ano = 2024;
        this.preco = 50000.0;
    }
    
    // 3. Construtor com todos os parâmetros
    public Carro(String modelo, int ano, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
    
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + " | Ano: " + ano + " | Preço: R$" + preco);
    }
}

// Classe principal com main
public class Construtores {
    public static void main(String[] args) {
        // Testando cada construtor
        Carro c1 = new Carro(); // Chama construtor padrão
        Carro c2 = new Carro("Civic"); // Chama construtor com 1 parâmetro
        Carro c3 = new Carro("Corolla", 2025, 150000.0); // Chama construtor completo
        
        c1.exibirInfo();
        c2.exibirInfo();
        c3.exibirInfo();
    }
}