import javax.swing.*;
import java.lang.Integer;


public class Main {
    public static void main(String[] args) {
        int N, M, maior, linha;
        int maior_linha = 0;
        int maior_coluna = 0;
        int [][] matriz;


        System.out.println("Digite o número de linhas da matriz:");

        N = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o número de linhas da matriz:"));

        M = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o número de Colunas da matriz:"));

        matriz = new int[N][M];

        maior = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                matriz[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("Digite o valor da posição [" + i + "][" + j + "]")
                );

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    maior_linha = i;
                    maior_coluna = j;
                }

            }
        }
        JOptionPane.showMessageDialog(null,
                "O maior valor da matriz é: " + maior + "\n" +
                "Localizado na posição: [" + maior_linha + "][" + maior_coluna + "]"
        );
    }
}