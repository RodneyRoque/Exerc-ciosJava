package Exercícios01;
import java.text.DecimalFormat;
public class Exe1c {
    public static void main(String[] args) {
        float Vcompra = 637.78f;
        float desconto10 = 0.1f;
        float desconto7 = 0.07f;
        float desconto4 = 0.04f;
        DecimalFormat casas = new DecimalFormat("0.00");

        if(Vcompra > 150.00){
            desconto10 = Vcompra * desconto10;
            Vcompra = Vcompra - desconto10;
            System.out.println("Você obteve um desconto de 10%! o novo valor é de: "+casas.format(Vcompra));
        }
        else{
            if(Vcompra == 150.00){
                desconto7 = Vcompra * desconto7;
                Vcompra = Vcompra - desconto7;
                System.out.println("Você obteve um desconto de 7%! o novo valor é de: "+casas.format(Vcompra));
            }
        else{
            if(Vcompra < 150.00){
                desconto4 = Vcompra * desconto4;
                Vcompra = Vcompra - desconto4;
                System.out.println("Você obteve um desconto de 4%! o novo valor é de: "+casas.format(Vcompra));
            }
        }
        }
    }
}