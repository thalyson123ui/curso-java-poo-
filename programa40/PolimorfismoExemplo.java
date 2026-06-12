package programa40;

// Classe base
class Animal {
    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }
}

// Subclasse Cachorro
class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

// Subclasse Gato
class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}

// Classe principal
public class PolimorfismoExemplo {
    public static void main(String[] args) {
        // Polimorfismo: referência da classe base aponta para objetos diferentes
        Animal meuAnimal1 = new Cachorro();
        Animal meuAnimal2 = new Gato();

        meuAnimal1.emitirSom(); // Saída: O cachorro late: Au Au!
        meuAnimal2.emitirSom(); // Saída: O gato mia: Miau!
    }
}
