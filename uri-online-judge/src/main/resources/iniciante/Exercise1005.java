package iniciante;

import java.util.Scanner;

/*
* Calcular a m�dia de dois produtos
*/

public class Exercise1005 {

	 public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	        
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        
        double media = ((a * 3.5) / 11) + ((b * 7.5) / 11);
        
        System.out.printf("MEDIA = %.5f\n", media);
	        
	  }
}
