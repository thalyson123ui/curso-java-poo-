package programa36;

public class enumeracoes {
    public enum DiaSemana {
        SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO
    }

    public static void main(String[] args) {
        System.out.println("Hoje é " + DiaSemana.SEGUNDA);
    }
}
