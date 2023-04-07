package Exemplos;
import java.text.DecimalFormat;
public class DiaAno { 
 public DiaAno() {
 } 
 
 public static void main(String[] args) { 
 float dia = 500f;
 float ano; 
 DecimalFormat casas= new DecimalFormat("0.00");
 ano=dia/365;
 System.out.println(dia + " dias corresponde a " + casas.format(ano)+" anos"); 
 }
}
