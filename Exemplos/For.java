package Exemplos;

public class For {
    public static void main(String[] args) {
        int inteiro = 1;
        for(inteiro = 1; inteiro<=10; inteiro++){ //For em ordem crescente
            System.out.println(inteiro);
        } 
        System.out.println("------------------------------"); //Separação em linhas

        for(inteiro = 10; inteiro>=1; inteiro--){ //For em ordem decrescente
            System.out.println(inteiro);
        } 
    }
}
