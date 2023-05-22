package modulo01.aula05;

import java.util.Scanner;


/*
	1. Dado um número, exibir os 10 próximos multiplos
    Entrada Numero: 5
            >> 5 10 15 20 25 30 35 40 45 50
 */
public class ExibeMultiplos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;

        System.out.println("Informe um número inteiro:");
        numero = leitor.nextInt();


        for (var i = 1; i <= 10; i++ ) {
            System.out.println((numero * i));
        }
    }
}
