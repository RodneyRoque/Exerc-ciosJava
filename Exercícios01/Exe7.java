package Exercícios01;
public class Exe7 {
    public static void main(String[] args) {
        int numCasa = 66;
        
        if(numCasa < 65){
            System.out.println("Você pagará o IPTU parcelado em 3 vezes");
        }
        else{
            if(numCasa == 65){
                System.out.println("Você pagará o IPTU em duas parcelas");
            }
        else{
            System.out.println("Você pagará o IPTU à vista");
        }
        }
    }
}
