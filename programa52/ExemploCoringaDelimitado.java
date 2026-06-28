package programa52;

import java.util.*;

class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latido!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

public class ExemploCoringaDelimitado {

    // Usa coringa delimitado superior (? extends Animal)
    // Aceita listas de qualquer tipo que herde de Animal
    public static void mostrarSons(List<? extends Animal> animais) {
        for (Animal a : animais) {
            a.emitirSom();
        }
    }

    // Usa coringa delimitado inferior (? super Cachorro)
    // Aceita listas de Cachorro ou de supertipos (Animal, Object)
    public static void adicionarCachorros(List<? super Cachorro> lista) {
        lista.add(new Cachorro());
        lista.add(new Cachorro());
    }

    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();
        adicionarCachorros(cachorros);

        List<Gato> gatos = Arrays.asList(new Gato(), new Gato());

        System.out.println("Sons dos cachorros:");
        mostrarSons(cachorros);

        System.out.println("Sons dos gatos:");
        mostrarSons(gatos);
    }
}
