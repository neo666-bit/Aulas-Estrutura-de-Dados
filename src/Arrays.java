import javax.swing.*;


public class Arrays {
    public static void main(String[] args) {
        int [][] matriz;
        int N;
        int soma = 0;

        N = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o número de Linhas/Colunas da matriz:"));
        matriz = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                matriz[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("Digite o valor da posição [" + i + "][" + j + "]")
                );
                if (i == j){
                    soma += matriz[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null,"A soma da diagonal principal é: " + soma);
    }
}
