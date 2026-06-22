package programa48;

// Definição da interface
interface Animal {
    void emitirSom(); // método abstrato
}

// Classe que implementa a interface
class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

// Outra classe que implementa a interface
class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.emitirSom();
        meuGato.emitirSom();
    }
}
