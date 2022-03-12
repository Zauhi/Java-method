import java.util.Scanner;
//Eu desenvolvi um somador com input
public class Calculadora {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        double n2 = scan.nextInt();

        double soma = n1 + n2;
        System.out.println(n1+"+"+n2+"="+soma);
    }
}
