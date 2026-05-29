package programa31;
import java.util.List;
import java.util.ArrayList;

public class listapt2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("maria");
        list.add("joao");
        list.add("ana");
        list.add(2, "pedro");

        System.out.println("Tamanho da lista: " + list.size());
        for (String nome : list) {
            System.out.println("---------------------");
            System.out.println(nome);
        }
        list.removeIf(String::isEmpty);
    }
}
