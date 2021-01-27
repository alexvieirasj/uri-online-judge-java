package iniciante;

import java.util.Scanner;
/*
* Calcular consumo médio de um automóvel
*/

public class Exercise1014 {

	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
	        
	        int x = scan.nextInt();
	        double y = scan.nextDouble();
	        
	        double gasto = x / y;
	        
	    	System.out.printf("%.3f km/l\n",gasto);
	       
	  }
}
