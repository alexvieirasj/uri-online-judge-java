package iniciante;
import java.util.Scanner;

/* Fibonacci em Vetor */

public class Exercise1176 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		int numTestes = leitor.nextInt();
		
		for(int i = 1; i <= numTestes; i++ ) {
			
			int X = leitor.nextInt();
			
			long vetor[] = new long[61];
			
			if(X == 0) {
				System.out.println("Fib(0) = " + X);
			}
			else if(X == 1) {
				System.out.println("Fib(1) = " + X);
			} else {
				
				vetor[0] = 0;
				vetor[1] = 1;
							
				for(int j=2; j <= 60; j++ ) {
					vetor[j] = vetor[j-2] + vetor[j-1];	
					
					if(j == X)
						System.out.println("Fib("+(X)+") = " + vetor[j]);
				}
			}
			
		}
		
		
	}
}
