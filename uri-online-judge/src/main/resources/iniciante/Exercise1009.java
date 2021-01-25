package iniciante;

import java.util.Scanner;

/*
* Calcular sálario com bonus
*/

public class Exercise1009 {

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	      
		 String vendedor = scan.next();
		 double salario = scan.nextDouble();
         double vendas = scan.nextDouble();
        
         double total = ((vendas * 15) /100) + salario;
        
         System.out.printf("TOTAL = R$ %.2f\n",total);	        
	  }
}
