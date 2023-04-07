package Exercícios01;
//converta R$ 3.657,38 para dólar ($). Usar para formula: $ 1,00 = R$ 2,35. (utilizar as variáveis vreal = 2657.38, vdolar = 2.35 e dolar)
import java.text.DecimalFormat;
public class ExC {
      public static void main(String[] args){
        double Vreal = 2657.38;
        double Vdolar = 2.35;
        double Vconvertido = Vreal * Vdolar;
        DecimalFormat casas = new DecimalFormat("0.00");

        System.out.println("R$2657,38 reais para dólares é igual a: "+"$"+casas.format(Vconvertido)+" dólares");
    }
}
