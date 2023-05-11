package modulo01.aula03;

import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("Informe a sua idade");

        idade = leitor.nextInt();
        /*
        operadores relacionais
        >       maior
        <       menor
        >=      maior ou igual
        <=      menos ou igual
        ==      igual (para String .equals() )
        !=      diferene (exclamação em Java significa não)
         */

        if (idade >= 12){
            System.out.println("Pode assistir o filme"); // decisão simples (apenas um trecho)
        } else {
            System.out.println("Filme não recomendado para menores de 12 anos"); // decisão completa (tem dois ou mais trechos)
        }
        // else if é uma decisão encadeada
    }
}
