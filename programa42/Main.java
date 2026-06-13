package programa42;

// Classe abstrata com método abstrato
abstract class Forma {
    // Método abstrato: não tem corpo, deve ser implementado pelas subclasses
    public abstract double calcularArea();

    // Método concreto: já tem implementação
    public void mostrarTipo() {
        System.out.println("Esta é uma forma geométrica.");
    }
}

// Subclasse que implementa o método abstrato
class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// Outra subclasse
class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        Forma f1 = new Circulo(5);
        Forma f2 = new Retangulo(4, 6);

        f1.mostrarTipo();
        System.out.println("Área do círculo: " + f1.calcularArea());

        f2.mostrarTipo();
        System.out.println("Área do retângulo: " + f2.calcularArea());
    }
}
