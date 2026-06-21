package programa47;

import java.io.File;

public class informacoesdocaminho {
    public static void main(String[] args) {
        // Definindo o caminho do arquivo
        File arquivo = new File("C:\\Users\\Thalyson\\Documentos\\exemplo.txt");

        // Obtendo informações sobre o arquivo
        System.out.println("Nome do arquivo: " + arquivo.getName());
        System.out.println("Caminho absoluto: " + arquivo.getAbsolutePath());
        System.out.println("Diretório pai: " + arquivo.getParent());
        System.out.println("Existe? " + arquivo.exists());
        System.out.println("É um diretório? " + arquivo.isDirectory());
        System.out.println("É um arquivo? " + arquivo.isFile());
    }
}
