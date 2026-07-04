package programa59;

import java.util.function.Function;

public class ExemploFunctionParametro {

    public static void processarTexto(String texto, Function<String, String> funcao) {
        String resultado = funcao.apply(texto);
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {

        // Converter para maiúsculas
        processarTexto("java", texto -> texto.toUpperCase());

        // Adicionar uma mensagem
        processarTexto("Java", texto -> "Bem-vindo ao " + texto + "!");

        // Informar o tamanho da palavra
        processarTexto("Programação",
                texto -> "Quantidade de letras: " + texto.length());
    }
}