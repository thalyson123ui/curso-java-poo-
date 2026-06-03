package programa34;
public class convertendohoraedataparatexto {
    public static void main(String[] args) {
        java.time.LocalDate data = java.time.LocalDate.of(2024, 6, 15);
        String dataTexto = data.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int hora = 14;
        int minuto = 30;
        int segundo = 45;

        String horaTexto = String.format("%02d:%02d:%02d", hora, minuto, segundo);
        System.out.println("Data convertida para texto: " + dataTexto);
        System.out.println("Hora convertida para texto: " + horaTexto);
    }
}
