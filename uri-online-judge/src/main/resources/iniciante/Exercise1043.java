package iniciante;

import java.util.Scanner;
/*
* Calcular triângulo
*/

public class Exercise1043 {

	 public static void main(String[] args) {
		 	Scanner leitor = new Scanner(System.in);
	        
		 	double a = leitor.nextDouble();
		 	double b = leitor.nextDouble();
		 	double c = leitor.nextDouble();
		 	
		 	if( ((a + b) > c) && ((a + c) > b) && ((b + c) > a) ) {
		 		System.out.printf("Perimetro = %.1f\n", (a + b + c));
		 	} else {
		 		System.out.printf("Area = %.1f\n", ( (a + b) * c)/2 );
		 	}
		 	
	    }
	}
