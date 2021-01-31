package iniciante;

import java.util.Scanner;
/*
* Calcular teste de seleção 1
*/

public class Exercise1035 {

	 public static void main(String[] args) {
		 	Scanner scan = new Scanner(System.in);
		 	
		 	int a = scan.nextInt();
		 	int b = scan.nextInt();
		 	int c = scan.nextInt();
		 	int d = scan.nextInt();
		 	
		 	// b > c
		 	// d > a
		 	// c + d > a + b
		 	// c e d forem positivos
		 	// a for par
		 	
		 	boolean valorAceito = (a % 2 == 0) && (c >= 0 && d >= 0) && (b > c) && (d > a) &&  ((c + d) > (a + b));
		 	
		 	if(valorAceito) {
		 		System.out.println("Valores aceitos");
		 	} else {
		 		System.out.println("Valores nao aceitos");
		 	}		 	
	  }
}
