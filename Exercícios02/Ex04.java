package Exercícios02;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome: ");
        String CPF = JOptionPane.showInputDialog("CPF: ");
        String Endereco = JOptionPane.showInputDialog("Endereço: ");
        String lerultimoSalario = JOptionPane.showInputDialog("Digite seu último salário: ");
        float ultimoSalario = Float.parseFloat(lerultimoSalario);
        int meses = 1;
        float aumento = 1.07f;
        DecimalFormat casas = new DecimalFormat("0.00");

        System.out.println("Seu nome é: "+nome);
        System.out.println("De cpf: "+CPF);
        System.out.println("Mora em: "+Endereco);
        
        while(meses <= 6){
            System.out.println("Você estava recebendo: "+casas.format(ultimoSalario));
            ultimoSalario *= aumento;
            System.out.println("Você recebeu um aumento de 7%, valor agora: "+casas.format(ultimoSalario));
            System.out.println(meses+"° mês");
            meses++;
        }
    }
}
