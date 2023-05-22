package modulo01.aula05;

import java.util.Scanner;

/*
Dado um número, exibir o seu fatorial (ex: fatorial de 4 -> 4! - 4 x 3 x 2 x 1 = 24
     Numero: 4
     >> Fatorial = 24
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = 0, fatorial = 1, contador;

        System.out.println("Informe um número e será exibido seu fatorial");
        numero = leitor.nextInt();
        contador = numero;
        fatorial = numero;

        while (contador <= 1) {
            fatorial = fatorial * (contador - 1);
            contador --;
        }

        System.out.println(fatorial);
    }
}
