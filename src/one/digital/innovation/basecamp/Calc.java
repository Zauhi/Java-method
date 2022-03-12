package one.digital.innovation.basecamp;

import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;

public class Calc {
    public static void soma(double n1, double n2){
        double resultado = n1 + n2;
        System.out.println(n1+"+"+n2+"="+resultado);
    }
    public static void dif(double n1, double n2){
        double resultado = n1 - n2;
        System.out.println(n1+"-"+n2+"="+resultado);
    }
    public static void mult(double n1, double n2){
        double resultado = n1 * n2;
        System.out.println(n1+"*"+n2+"="+resultado);
    }
    public static void div(double n1, double n2){
        double resultado = n1 / n2;
        System.out.println(n1+"/"+n2+"="+resultado);
    }
}
