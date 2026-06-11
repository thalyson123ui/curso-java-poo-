package programa38;

// Classe base
class Animal {
    public void fazerSom() {
        System.out.println("Algum som de animal...");
    }
}

// Subclasse
class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Latido: Au Au!");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Upcasting: Cachorro tratado como Animal
        Animal meuAnimal = new Cachorro(); 
        meuAnimal.fazerSom(); // Chama o método sobrescrito em Cachorro

        // Downcasting: voltando para Cachorro
        Cachorro meuCachorro = (Cachorro) meuAnimal; 
        meuCachorro.abanarRabo(); // Agora podemos acessar métodos específicos de Cachorro
    }
}
