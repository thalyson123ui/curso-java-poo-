package programa41;

// Classe abstrata
abstract class Animal {
    // Método abstrato (sem implementação)
    public abstract void emitirSom();

    // Método concreto (com implementação)
    public void dormir() {
        System.out.println("O animal está dormindo...");
    }
}

// Subclasse que herda de Animal
class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

// Outra subclasse
class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}

// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.emitirSom(); // Saída: O cachorro late: Au Au!
        meuCachorro.dormir();    // Saída: O animal está dormindo...

        meuGato.emitirSom();     // Saída: O gato mia: Miau!
        meuGato.dormir();        // Saída: O animal está dormindo...
    }
}
