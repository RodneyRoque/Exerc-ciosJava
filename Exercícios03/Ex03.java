package Exercícios03;

import java.text.DecimalFormat;

public class Ex03 {
    public static void main(String[] args) {
        float valor = 1000.00f;
        DecimalFormat casas = new DecimalFormat("0.00");

        for(int meses = 1; meses <= 10; meses++){
            valor *= 1.1;
            System.out.println("O valor da aplicação no "+meses+"° mês é de: R$"+casas.format(valor));
        }
    }
}
