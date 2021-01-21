package iniciante;

import java.util.Scanner;

/*
* Calcular a diferença entre A, B, C e D
*/

public class Exercise1007 {

	 public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int a = ler.nextInt();
	        int b = ler.nextInt();
	        int c = ler.nextInt();
	        int d = ler.nextInt();
	     
	        int diferenca = (a * b - c * d);
	        
	        System.out.println("DIFERENCA = "+diferenca);
	        
	    }
}
