package Exercícios01;
public class Ex1b {
    public static void main(String[] args){
        int QuantAlunos = 15;
        if(QuantAlunos > 30){
            System.out.println("Vocês ganharam uma passagem para Cancun");
        }
        else{
            if(QuantAlunos == 30){
                System.out.println("Vocês ganharam uma passagem para Fortaleza");
            }
        else{
            System.out.println("Vocês ganharam uma passagem para Caldas Novas");
            }
        }
    }
}
