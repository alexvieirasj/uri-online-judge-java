package iniciante;

import java.util.Scanner;

/*
* Calcular a média de a, b e c
*/

public class Exercise1006 {

	 public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	        
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        
        double media = ((a * 2.0) / 10) + ((b * 3.0) / 10) + ((c * 5.0) / 10);
        
        System.out.printf("MEDIA = %.1f\n", media);
	        
	  }
}
