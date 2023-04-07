package Exercícios01;
//escreva na tela a idade de João = 31, Pedro = 27, Lucas =35, Rodolfo = 23 e Marina = 22 e mostre o resultado da soma das idades.
public class ExB {
    public static void main(String[] args){
        int IdadeJoao = 15;
        int IdadePedro = 17;
        int IdadeLucas = 20;
        int IdadeRodolfo = 26;
        int IdadeMariana = 32;
        int SomaIdades = IdadeJoao + IdadePedro + IdadeLucas + IdadeRodolfo + IdadeMariana;

        System.out.println("João tem: "+IdadeJoao);
        System.out.println("Pedro tem: "+IdadePedro);
        System.out.println("Lucas tem: "+IdadeLucas);
        System.out.println("Rodolfo tem: "+IdadeRodolfo);
        System.out.println("Mariana tem: "+IdadeMariana);
        System.out.println("A soma de todas as idades é de: "+SomaIdades);
    }
}
