package iniciante;
import java.util.Scanner;

/* Soma de Pares Consecutivos */

public class Exercise1159 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		int X;
		int contPares = 0, resultado = 0;
		
		while( (X = leitor.nextInt()) != 0 ) {
			
			
			if(X % 2 != 0) {
				X++;
			}
			
			System.out.println("x: " + X);

			while(contPares < 5) {
				
				if(X % 2 == 0) {	
					
					resultado += X;
					contPares++;
				}
				X++;
			}

			System.out.println(resultado);
			contPares = 0;
			resultado = 0;
		}

	}
}
