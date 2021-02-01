package iniciante;

import java.util.Scanner;
/*
* Calcular Fórmula de Bhaskara
*/

public class Exercise1036 {

	 public static void main(String[] args) {
		 	Scanner scan = new Scanner(System.in);
		 	
		 	double a = scan.nextDouble();
		 	double b = scan.nextDouble();
		 	double c = scan.nextDouble();
		 	
		 	double delta = (b * b) - (4 * a * c);

		 	
		 	if(a == 0 || delta < 0) {
		 		System.out.println("Impossivel calcular");
		 	} else {
			 	double raizDelta = Math.sqrt(delta);
			 	
			 	double sobre = 2 * a;
			 	double antesRaiz = b * - 1;
			 	double resultado1 = (antesRaiz + raizDelta) / sobre;
			 	double resultado2 = (antesRaiz - raizDelta) / sobre;
			 	
			 	System.out.printf("R1 = %.5f\n", resultado1);
			 	System.out.printf("R2 = %.5f\n", resultado2);
		 	}
		 	
	  }
}
