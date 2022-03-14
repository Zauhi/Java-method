package one.digital.innovation.basecamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //        Calculadora
        System.out.println("Exercício calculadora");
        Scanner scan=new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = scan.nextInt();
        System.out.print("Digite o primeiro número: ");
        double n2 = scan.nextInt();
        Calc.soma(n1,n2);
        Calc.dif(n1,n2);
        Calc.mult(n1,n2);
        Calc.div(n1,n2);
    }
}
