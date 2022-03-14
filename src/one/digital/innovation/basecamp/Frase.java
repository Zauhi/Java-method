package one.digital.innovation.basecamp;

import java.util.Random;
import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        // Mensagem
        System.out.println("Exercício Mensagem");
        System.out.print("Digite o horário em horas sem minutos: ");
        Scanner scan=new Scanner(System.in);
        int h = scan.nextInt();
        Mensagem.msg(h);
    }
}
