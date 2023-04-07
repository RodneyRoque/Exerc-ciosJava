package Exercícios02;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args) {
        float valorCarro;
        String carro = JOptionPane.showInputDialog("Qual o nome do carro? ");
        String lervalorCarro = JOptionPane.showInputDialog("Qual o valor do carro? ");
        valorCarro = Float.parseFloat(lervalorCarro);
        int meses = 1;
        DecimalFormat casas = new DecimalFormat("0.00");

        System.out.println("O carro "+carro+" está saindo à vista por "+valorCarro);
        System.out.println("Parcelado em 48 vezes, terá uma taxa de juros de 1,5% ao mês");
        while(meses <= 48){
            valorCarro *= 1.015;
            System.out.println(meses+"°mês de juros, novo valor: "+casas.format(valorCarro));
            meses++;
        }

        System.out.println("O valor final do carro após 48 meses é de: "+casas.format(valorCarro));
    }
}
