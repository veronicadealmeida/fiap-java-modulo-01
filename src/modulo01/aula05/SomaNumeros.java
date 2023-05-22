package modulo01.aula05;

import java.util.Scanner;

/*
2. Somar 5 numeros digitados pelo usuário.
    Numeros: 6 4 5 6 4
>> Soma = 25
 */
public class SomaNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;

        System.out.println("Informe 5 números e será exibida a soma...");


        for (var i = 1; i <= 5; i++){
            System.out.println("Digite o número " + i);
            soma += leitor.nextInt();
        }

        System.out.println("A soma é: " + soma);
    }
}
