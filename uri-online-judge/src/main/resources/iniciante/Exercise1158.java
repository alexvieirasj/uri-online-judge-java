package iniciante;
import java.util.Scanner;

/* Soma de Ímpares Consecutivos III */

public class Exercise1158 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);

		int N = leitor.nextInt();
		int somaImpares = 0, resultado = 0;
		
		while(N > 0) {
			
			int X = leitor.nextInt();
			int Y = leitor.nextInt();
			
			somaImpares = X + Y;
				
			if(X % 2 == 0) {
				X++;
			}
			
			while(Y > 0) {
				
				if(X % 2 != 0) {					
					resultado += X;
					Y--;
				}
				X++;
			}

			System.out.println(resultado);
			
			N--;
			somaImpares = 0;
			resultado = 0;
		}

	}
}
