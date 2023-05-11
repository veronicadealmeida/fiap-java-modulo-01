package modulo01.aula03;

import java.util.Scanner;

public class CalculaImc {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double altura;
        double peso;
        double imc;
        String resultadoDoImcExibido = "";

        System.out.println("Informe seu peso:");
        peso = leitor.nextDouble();

        System.out.println("Informe sua altura:");
        altura = leitor.nextDouble();

        imc = (peso / (altura * altura) );

        /* cálculo do IMC -> (peso / altura *)

                    IMC	Classificação
            Menor que 18,5	Magreza
            18,5 a 24,9	    Normal
            25 a 29,9	    Sobrepeso
            30 a 34,9	    Obesidade grau I
            35 a 39,9	    Obesidade grau II
            Maior que 40	Obesidade grau III
         */
        /*
        operadores lógicos      prioridade
        !      Não              1
        &&       E              2
        ||      OU              3

         */

        if (imc < 18.5){
            resultadoDoImcExibido = "Magreza";
        } else if (imc >= 18.5 && imc <= 24.99) {
            resultadoDoImcExibido = "Normal";
        } else if (imc >= 25 && imc <= 29.99) {
            resultadoDoImcExibido = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.99) {
            resultadoDoImcExibido = "Obesidade grau I";
        } else if (imc >= 35 && imc <= 39.99) {
            resultadoDoImcExibido = "Obesidade grau II";
        } else {
            resultadoDoImcExibido = "Obesidade grau III";
        }

        System.out.println("IMC: " + String.format("%.2f",imc)  + " (" + resultadoDoImcExibido + ")");
    }
}
