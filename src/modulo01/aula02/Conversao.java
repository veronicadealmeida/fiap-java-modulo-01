package modulo01.aula02;

import java.util.Scanner;

public class Conversao {
    
    static final double taxaDeConversao = 4.987;
    public static void main(String[] args) {
        /*
        Ocasionalmente a ONG para a qual você trabalha recebe doações em dólar e precisa
        saber qual é o valor em reais.
        Crie um programa que permita que o usuário digite o valor da doação em dólares,
        converta esse valor para reais e exiba o resultado na tela.

         */

        double doacaoEmDolar = 0;
        double doacaoEmReais = 0;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informa a doação e dólar:");
        doacaoEmDolar = leitor.nextDouble();

        doacaoEmReais = doacaoEmDolar  * taxaDeConversao ;
        System.out.println(doacaoEmDolar);

        System.out.println("O valor da doação em Reais é RS " + String.format("%.2f", doacaoEmReais));
        leitor.close();
    }
}
