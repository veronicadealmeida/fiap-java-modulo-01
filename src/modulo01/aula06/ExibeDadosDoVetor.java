package modulo01.aula06;

import java.util.Scanner;

public class ExibeDadosDoVetor {
    public static final int qtdNumeros = 10;
    public static void main(String[] args) {

        Scanner leitorNumero = new Scanner(System.in);

        int[] vetor = new int[qtdNumeros];
        int i;
        int soma = 0;
        double media;
        int negativo;

        // Preencha um vetor com 10 números
        for (i=0; i < vetor.length; i++) {
            System.out.println("Digite o " + (1+i) + " número:");
            vetor[i] = leitorNumero.nextInt();
        }

        int maior = vetor[0];

        // Exibe o maior valor
        for (i=0; i < vetor.length; i++) {
            if ( vetor[i] > maior)
                maior = vetor[i];
        }

        System.out.println("O maior valor do vetor é: " + maior);

        // Soma os elementos do vetor
        for (i=0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        // Exibe a média dos elementos inseridos
        media = (double) soma / vetor.length;
        System.out.println("A soma dos valores do vetor é: " + soma
                            + "\nA média: " + media);

        // Exibe o índice do primeiro positivvo inserido
        for (i=0; i < vetor.length; i++) {
            if (vetor[i] >= 0) {
                System.out.println("Índice do primeiro positivo: " + i);
                break;
            }
        }

        // Exibe o índice do último negativo
        for (i=0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                negativo = i;
            }
        }
        System.out.println("O índice do último negativo : " + i);
    }
}
