package programa30;

public class listas {
    public static void main(String[] args) {
        // listas em java
        // criar uma lista de inteiros
        java.util.List<Integer> lista = new java.util.ArrayList<>();
        // adicionar elementos na lista
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        // exibir elementos da lista
        System.out.println("Elementos da lista:");
        for (int numero : lista) {
            System.out.println(numero);
        }
    }
}
