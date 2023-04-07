//Utilizando array, crie um programa que leia o nome, cpf, nota 1, nota 2 de 10 alunos.
//Escreva o nome  do 4° aluno cadastrado, o cpf do 7° aluno, a média das nota 1 e 2 do 2° aluno .
package Exercícios04;

import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        String nome[]= new String[9];
        String cpf[] = new String[9];
        int nota1[] = new int[9];
        int nota2[] = new int[9];
        int conta = 0;

        for(conta = 0; conta <=9;conta++){
            String lernome = JOptionPane.showInputDialog("Digite seu nome: ");
            nome[conta] = lernome;

            String lercpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
            cpf[conta] = lercpf;

            String lernota1 = JOptionPane.showInputDialog("Digite a nota 1: ");
            nota1[conta] = Integer.parseInt(lernota1);

            String lernota2 = JOptionPane.showInputDialog("Digite a nota 2: ");
            nota2[conta] = Integer.parseInt(lernota2);
        }

        System.out.println("O aluno cadastrado na posição 4 é o: "+nome[4]);
        System.out.println("O cpf do 7° aluno é: "+nome[7]+" "+cpf[7]);
        System.out.println("A média das notas do 2°aluno é: "+ (nota1[2] + nota2[2] / 2));
    }
}
