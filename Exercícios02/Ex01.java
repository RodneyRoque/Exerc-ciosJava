package Exercícios02;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        String nomeProduto;
        int quantCompra;
        double valorUnitario;
        DecimalFormat casas = new DecimalFormat("0.00");

        String lernomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
        nomeProduto = lernomeProduto;
        String lerquantCompra = JOptionPane.showInputDialog("Digite quantos produtos: ");
        quantCompra = Integer.parseInt(lerquantCompra);
        String lervalorUnitario = JOptionPane.showInputDialog("Digite o valor unitário do produto: ");
        valorUnitario = Double.parseDouble(lervalorUnitario);

        JOptionPane.showMessageDialog(null, "Nome do produto: "+nomeProduto);
        JOptionPane.showMessageDialog(null, "Quant produtos? "+quantCompra);
        JOptionPane.showMessageDialog(null, "Valor Unitário do produto: "+valorUnitario);
        
        double valorTotal = quantCompra * valorUnitario;
        JOptionPane.showMessageDialog(null, "O valor total é de: "+casas.format(valorTotal));
    }
}
