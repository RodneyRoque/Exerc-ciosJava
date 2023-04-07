package Exercícios01;
public class Exe1d {
    public static void main(String[] args) {
        int pontosCarteira = 10;
        if(pontosCarteira < 5){
            System.out.println("Apesar da multa você é um bom condutor!");
        }
        else{
            if(pontosCarteira == 5){
                System.out.println("Apesar de dirigir bem, tome cuidado!");
            }
        else{
            if(pontosCarteira > 5){
                System.out.println("Ta bagunçando demais hein!");
            }  
        }
        }
    }
}
