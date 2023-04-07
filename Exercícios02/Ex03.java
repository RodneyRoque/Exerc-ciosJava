package Exercícios02;
import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        float notaNP1,notaNP2,mediaSemest,mediaFinal,notaExame;
        String lerNP1 = JOptionPane.showInputDialog("Digite a nota da NP1: ");
        notaNP1 = Float.parseFloat(lerNP1);
        String lerNP2 = JOptionPane.showInputDialog("Digite a nota da NP2: ");
        notaNP2 = Float.parseFloat(lerNP2);

        mediaSemest = (notaNP1 + notaNP2) / 2;
        System.out.println("A sua média semestral foi de: " + mediaSemest);

        if (mediaSemest < 7){
            String lerExame = JOptionPane.showInputDialog("Você ficou de exame, digite a nota do exame: ");
            notaExame = Float.parseFloat(lerExame);
            mediaFinal = (mediaSemest + notaExame) / 2;
            System.out.println("A média final foi: " + mediaFinal);
        }else{
            System.out.println("Parabéns, você foi aprovado sem exame!");
        }
    }
}
