package modulo01.aula04;

import java.util.Scanner;

public class TesteLacos {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double somaAltura = 0, media;
        int aluno = 1;

        Scanner leitor = new Scanner(System.in);

        while (aluno <= 6) {
            System.out.println("Digite a altura do " + aluno +"º aluno");
            somaAltura += leitor.nextDouble();
            aluno++;
        }

        media = (somaAltura)/6;
        System.out.println("A media de altura dos alunos é de " + media);
        leitor.close();
    }
}
