package iniciante;

import java.util.Scanner;

/*
* Cálculo simples
*/

public class Exercise1010 {

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	      
		 int a1 = scan.nextInt();
		 int b1 = scan.nextInt();
		 double c1 = scan.nextDouble();
		 
		 int a2 = scan.nextInt();
		 int b2 = scan.nextInt();
		 double c2 = scan.nextDouble();
        
		 double total =  (b1 * c1) + (b2 * c2) ;
        
         System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);	        
	  }
}
