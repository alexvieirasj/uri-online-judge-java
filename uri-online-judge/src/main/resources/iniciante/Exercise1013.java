package iniciante;

import java.util.Scanner;
import static java.lang.Math.abs;

/*
* Verifica o maior número
*/

public class Exercise1013 {

	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
	        
	        int maior, maiorTotal;
	        
	        int a = scan.nextInt();
	        int b = scan.nextInt();
	        int c = scan.nextInt();
	        
	        maior = (a+b+abs(a-b))/2;
	        maiorTotal = (maior+c+abs(maior-c))/2;
	        
	        System.out.println(maiorTotal+" eh o maior");
	  }
}
