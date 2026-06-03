package programa35;

public class converterdataehoraglobal {
    public static void main(String[] args) {
        // Obter a data e hora atual
        java.util.Date dataHoraAtual = new java.util.Date();

        // Converter para o formato global (ISO 8601)
        java.text.SimpleDateFormat formatoGlobal = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String dataHoraGlobal = formatoGlobal.format(dataHoraAtual);

        // Exibir a data e hora no formato global
        System.out.println("Data e Hora Global (ISO 8601): " + dataHoraGlobal);
    }
}
