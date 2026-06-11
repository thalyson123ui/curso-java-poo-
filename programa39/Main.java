package programa39;

// Classe base
class Animal {
    public void fazerSom() {
        System.out.println("Som genérico de animal...");
    }

    public void dormir() {
        System.out.println("Animal está dormindo...");
    }
}

// Subclasse
class Cachorro extends Animal {

    // Sobrescrevendo o método da classe pai
    @Override
    public void fazerSom() {
        // Chamando o método da classe pai com super
        super.fazerSom(); 
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
        meuAnimal.fazerSom(); // Executa o método sobrescrito em Cachorro

        // Downcasting: voltando para Cachorro
        if (meuAnimal instanceof Cachorro) {
            Cachorro meuCachorro = (Cachorro) meuAnimal;
            meuCachorro.abanarRabo();
            meuCachorro.dormir(); // Método herdado da classe Animal
        }
    }
}
