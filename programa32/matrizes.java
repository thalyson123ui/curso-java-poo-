package programa32;

public class matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int valor = 1;

        // Preenchendo a matriz com valores de 1 a 9
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
