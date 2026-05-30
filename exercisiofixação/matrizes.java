package exercisiofixação;

import java.util.Scanner;

public class matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Ler as dimensões da matriz (M linhas e N colunas)
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        // 2. Preencher a matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // 3. Ler o número X a ser pesquisado
        int x = sc.nextInt();

        // 4. Percorrer a matriz para encontrar as ocorrências de X
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");

                    // Verificar e mostrar o valor à esquerda (mesma linha, coluna anterior)
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    // Verificar e mostrar o valor acima (linha anterior, mesma coluna)
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    // Verificar e mostrar o valor à direita (mesma linha, próxima coluna)
                    if (j < n - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    // Verificar e mostrar o valor abaixo (próxima linha, mesma coluna)
                    if (i < m - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}

