package Exercícios02;
import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        int numero = 0;
        int soma = 0;
        int media = 0;
        int contador = 0;

        while(numero != 9999){
            String lernumero = JOptionPane.showInputDialog("Digite um numero: ");
            numero = Integer.parseInt(lernumero);
            
            soma += numero;
            contador++;
            media = soma/contador;
            System.out.println("O número digitado foi: " + numero + " e a média é de: " + media);
        }
        
        System.out.println("Programa Encerrado!");
    }
}
