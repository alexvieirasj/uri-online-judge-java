package iniciante;

import java.util.Scanner;
/*
* Calcular intervalo entre os valores ([0,25], (25,50], (50,75], (75,100])
*/

public class Exercise1037 {

	 public static void main(String[] args) {
		 	Scanner scan = new Scanner(System.in);
		 	
		 	double valor = scan.nextDouble();
		 	
		 	if(valor >= 0 && valor <= 25.00) {
		 		System.out.println("Intervalo [0,25]");
		 	} else if(valor > 25.00 && valor <= 50.00) {
		 		System.out.println("Intervalo (25,50]");
		 	} else if(valor > 50.00 && valor <= 75.00) {
		 		System.out.println("Intervalo (50,75]");
		 	} else if(valor > 75.00 && valor <= 100.00) {
		 		System.out.println("Intervalo (75,100]");
		 	} else {
		 		System.out.println("Fora de intervalo");
		 	}
	  }
}
