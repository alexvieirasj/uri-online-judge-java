package iniciante;
import java.util.Scanner;

/* Mostrar a soma dos números que não são multiplos de 13 */

public class Exercise1132 {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int X = leitor.nextInt();
		int Y = leitor.nextInt(); 
		
		int menor = X;
		int maior = Y;
		int soma = 0;
		
		if(Y < menor) {
			menor = Y;
			maior = X;
		}
		
		for( int i=menor; i<= maior; i++ ) {
			
			if(i % 13 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);		
	}
}