package programa46;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class filereaderebufferreadewre {
    public static void main(String[] args) {
        String caminhoArquivo = "C:\\Users\\Thaly\\OneDrive\\Imagens\\52ad0263-cbe3-4137-9018-31ac5c8e9226.jpg"; // exemplo.txt

        // Usa try-with-resources e a variável caminhoArquivo para evitar warning
        try (FileReader fr = new FileReader(caminhoArquivo);
             BufferedReader br = new BufferedReader(fr)) {

            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
