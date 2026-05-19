package programa22;

import java.util.Scanner;
import java.util.Locale;

public class MenbrosEsteticos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando um objeto Pessoa com membros estéticos
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o nome: ");
        pessoa.setNome(sc.nextLine());

        System.out.print("Digite a cor dos olhos: ");
        pessoa.setOlhos(sc.nextLine());

        System.out.print("Digite a cor do cabelo: ");
        pessoa.setCabelo(sc.nextLine());

        System.out.print("Digite a altura (em metros): ");
        pessoa.setAltura(sc.nextDouble());

        System.out.println("\n--- Dados Estéticos ---");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Olhos: " + pessoa.getOlhos());
        System.out.println("Cabelo: " + pessoa.getCabelo());
        System.out.println("Altura: " + pessoa.getAltura() + " m");

        sc.close();
    }
}

class Pessoa {
    private String nome;
    private String olhos;
    private String cabelo;
    private double altura;

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getOlhos() { return olhos; }
    public void setOlhos(String olhos) { this.olhos = olhos; }

    public String getCabelo() { return cabelo; }
    public void setCabelo(String cabelo) { this.cabelo = cabelo; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
}



