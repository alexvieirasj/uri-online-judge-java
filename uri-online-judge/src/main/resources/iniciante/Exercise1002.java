package iniciante;

import java.util.Scanner;

/*
* Calcular a área do círculo 
*/

public class Exercise1002 {

	 public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);
	        
	        double raio = leitor.nextDouble();
	        double pi = 3.14159;
	        
	        double area = (raio*raio) * pi;
	        
	        System.out.printf("A=%.4f\n", area);
	        
	    }
}
