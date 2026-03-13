package Aula2;
import java.util.Arrays;
import java.util.Scanner;

public class Pilhas {
    int pilha[];
    int tamanho;
    Scanner sc = new Scanner(System.in);

    public void capacidade(int tamanho) {
        this.tamanho = tamanho;
        pilha = new int[tamanho];
    }
    public void pilhagem(){
        for (int i = 0; i < pilha.length; i++) {
            System.out.println("Digite o valor a ser empilhado: ");
            pilha[i] = sc.nextInt();

        }

        System.out.println(Arrays.toString(pilha));
    }
    public void desempilhar(){
        for (int i = pilha.length - 1; i >= 0; i--) {
            System.out.println("Desempilhando: " + pilha[i]);
        }
    }
}



