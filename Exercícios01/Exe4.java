package Exercícios01;
import java.text.DecimalFormat;

public class Exe4 {
    public static void main(String[] args) {
        double valor1 = 25.4;
        double valor2 = 36.75;
        double valor3 = 10;
        double valor4 = 37;
        double media = (valor1 + valor2 + valor3 + valor4) / 4;
        DecimalFormat casas = new DecimalFormat("0.00");

        System.out.println("A média dos números é: "+ casas.format(media));
    }
}
