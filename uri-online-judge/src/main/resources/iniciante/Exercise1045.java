package iniciante;

import java.util.Scanner;
import java.util.Arrays;
/*
* Calcular tipos de triângulos
*/

public class Exercise1045 {

	 public static void main(String[] args) {
		 	Scanner leitor = new Scanner(System.in);
	        
		 	float a = leitor.nextFloat();
		 	float b = leitor.nextFloat();
		 	float c = leitor.nextFloat();
		 	
		 	float ordenacaoArray[] = {a, b, c};
		 	Arrays.sort(ordenacaoArray);
		 	
		 	a = ordenacaoArray[2];
		 	b = ordenacaoArray[1];
		 	c = ordenacaoArray[0];		 	
		 	
		 	if( a >= (b + c)) {
		 		System.out.println("NAO FORMA TRIANGULO");
		 	} else if( (a*a) > ((b*b) + (c*c)) )  {
		 		System.out.println("TRIANGULO OBTUSANGULO");
		 	}
		 	
		 	if( (a*a) == ((b*b) + (c*c)) )  {
		 		System.out.println("TRIANGULO RETANGULO");
		 	}
		 	
		 	if( (a*a) < ((b*b) + (c*c)) )  {
		 		System.out.println("TRIANGULO ACUTANGULO");
		 	}
		 	if( a == b && b == c)  {
		 		System.out.println("TRIANGULO EQUILATERO");
		 	}
		 	if ((a == b || a == c) || (b == c || b == a) || (c == a || c == b) ) {	
		 		
		 		int cont = 0;
		 		if((a == b || a == c)) {
		 			cont++;
		 		}
		 		if((b == c || b == a)) {
		 			cont++;
		 		}
		 		if((c == a || c == b)) {
		 			cont++;
		 		}
		 		
		 		if(cont == 2)
		 			System.out.println("TRIANGULO ISOSCELES");
		 	}
	    }
	}
