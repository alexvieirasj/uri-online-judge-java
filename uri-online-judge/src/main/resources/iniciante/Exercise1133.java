package iniciante;
import java.util.Scanner;

/* Mostrar divisão dos números por 5 for igual a 2 ou igual a 3 */

public class Exercise1133 {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int X = leitor.nextInt();
		int Y = leitor.nextInt(); 
		
		int menor = X;
		int maior = Y;
		
		if(Y < menor) {
			menor = Y;
			maior = X;
		}
		
		for( int i = menor+1; i < maior; i++ ) {
			
			if(i % 5 == 2.0 || i % 5 == 3.0) {
				System.out.println(i);
			}
		}
		
				
	}
}