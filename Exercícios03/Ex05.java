package Exercícios03;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args) {
        float valor = 100.0f;
        String lerparticipantes = JOptionPane.showInputDialog("Digite a quantidade de participantes: ");
        int participantes = Integer.parseInt(lerparticipantes);
        DecimalFormat casas = new DecimalFormat("0.00");

        for(int meses = 2; meses <= 10; meses++){
            valor = (float) ((valor * 1.02) * participantes);
            System.out.println(casas.format(valor));
        }
    }
}
