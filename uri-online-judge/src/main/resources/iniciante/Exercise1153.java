package iniciante;
import java.util.Scanner;

/* Fatorial Simples */

public class Exercise1153 {
	
	public static void main(String args[]) {
		
		Scanner leitor = new Scanner(System.in);
		
		int N = 0;
		int valor = 1;
		
		do {			
			N = leitor.nextInt();			
		} while(N <= 0 && N > 13);
		

		for(int i = N; i > 0; i--) {			
			valor = valor * i;
		}
		
		System.out.println(valor);
    }	
}