package iniciante;

import java.util.Scanner;
/*
* Calcular coordenadas de um ponto em Quadrante
*/

public class Exercise1041 {

	 public static void main(String[] args) {
		 	Scanner leitor = new Scanner(System.in);
	        
		 	float x = leitor.nextFloat();
		 	float y = leitor.nextFloat();

		 	if(x == 0.0 && y == 0.0 ) {
		 		System.out.println("Origem");		 		
		 	} else if(x == 0){
		 	   System.out.printf("Eixo Y\n");
		 	} else if(y == 0){
		 	   System.out.printf("Eixo X\n");		 	
		 	} else if(x > 0) {
		 		
		 		if(y > 0) {
		 			System.out.println("Q1");
		 		} else {
		 			System.out.println("Q4");
		 		}
		 	} else if(x < 0) {
		 		
		 		if(y > 0) {
		 			System.out.println("Q2");
		 		} else {
		 			System.out.println("Q3");
		 		}
		 	} 

	        
	 }
}
