package iniciante;

import java.util.Scanner;
/*
* Calcular gasto de combustível
*/

public class Exercise1017 {

	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    
		    int tempoViagem = scan.nextInt();
		    int velocidadeMedia = scan.nextInt();
	      
		    double litros = (tempoViagem * velocidadeMedia) / 12.0; 
		    
		    System.out.printf("%.3f\n",litros);	       
	  }
}
