package iniciante;

import java.util.Scanner;

/*
* Calcular sálario de um funcionário
*/

public class Exercise1008 {

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
         int numero = scan.nextInt();
         int horas = scan.nextInt();
         double valorHoras = scan.nextDouble();
        
         float total = (float)(horas*valorHoras);
        
         System.out.println("NUMBER = "+numero);
         System.out.printf("SALARY = U$ %.2f\n",total);	        
	  }
}
