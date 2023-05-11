package modulo01.aula02;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        double resultado = 0;
        boolean exibeResultado = true;
        String operacao;
        String operacaoPorExtenso = "";

        Scanner leitor = new Scanner(System.in);
        System.out.println("********************************************************");
        System.out.println("Esse programa vai somar, subtrair, multiplicar e dividir");
        System.out.println("********************************************************");


        System.out.println("Informe o primeiro valor que deseja somar:");
        numero1 = leitor.nextInt();

        leitor.reset();

        System.out.println("Informe o segundo valor que deseja calcular:");
        numero2 = leitor.nextInt();

        leitor.reset();

        System.out.println("Informe a operação:");
        operacao = leitor.next();

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                operacaoPorExtenso ="somado a";
                break;
            case "-":
                resultado = numero1 - numero2;
                operacaoPorExtenso ="subtraído";
                break;
            case "/":
                try {
                    resultado = numero1 / numero2;
                    operacaoPorExtenso ="dividido por";
                }
                catch (ArithmeticException nexc) {
                    System.out.println("Não é possível dividir por zero");
                }

                break;
            case "*":
                resultado = numero1 * numero2;
                operacaoPorExtenso ="multiplicado por";

                break;
            default:
                System.out.println("A operação informada é inválida [ " + operacao + " ].");
                System.out.println("Valores aceitos: * (multiplicação), / (divisão), + (adição) ou - (subtração)");
                exibeResultado = false;
        }

        if(exibeResultado)
        System.out.println( numero1 + " " + operacaoPorExtenso + " " + numero2 +" é igual a  " + resultado);

        leitor.close();

    }
}
