package programa37;

public class heranca {
    public static void main(String[] args) {
        // Criando um objeto da classe Cachorro
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Rex";
        cachorro.idade = 5;
        cachorro.latir(); // Método específico da classe Cachorro
        cachorro.comer(); // Método herdado da classe Animal

        // Criando um objeto da classe Gato
        Gato gato = new Gato();
        gato.nome = "Mia";
        gato.idade = 3;
        gato.miar(); // Método específico da classe Gato
        gato.comer(); // Método herdado da classe Animal
    }
}

class Animal {
    String nome;
    int idade;

    void comer() {
        System.out.println(nome + " está comendo.");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println(nome + " está latindo.");
    }
}

class Gato extends Animal {
    void miar() {
        System.out.println(nome + " está miando.");
    }
}
