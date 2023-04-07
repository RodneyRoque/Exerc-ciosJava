package Exercícios03;

public class Ex04 {
    public static void main(String[] args) {
        int soma = 0;

        for(int i = 160; i <= 190; i+=2){
            System.out.println(i);
            soma += i;
            System.out.println("Soma: "+soma);
        }
    }
}
