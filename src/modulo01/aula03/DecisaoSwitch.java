package modulo01.aula03;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DecisaoSwitch {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String usuario, senha;
        Date data  = new Date();
        Calendar calendar = Calendar.getInstance();
        int diaDaSemana = 0;

        calendar.setTime(data);
        diaDaSemana = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("Digite seu login");
        usuario = leitor.nextLine();

        System.out.println("Digite sua senha");
        senha = leitor.nextLine();

        if (  usuario.toUpperCase().equals("ADMIN") && senha.equals("123")) {
            System.out.println("Bem vindo " + usuario);

            switch (diaDaSemana) {
                case 2:
                    System.out.println("Hoje é segunda-feira");
                    break;
                case 3:
                    System.out.println("Hoje é terça-feira");
                    break;
                case 4:
                    System.out.println("Hoje é quarta-feira");
                    break;
                case 5:
                    System.out.println("Hoje é quinta-feira");
                    break;
                case 6:
                    System.out.println("Hoje é sexta-feira");
                    break;
                default:
                    System.out.println("Bom descanso, aproveite seu final de semana");
            }
        } else {
            System.out.println("Login ou senha inválida");
        }
    }
}
