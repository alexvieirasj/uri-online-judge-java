package iniciante;
import java.util.Scanner;

/* Troca em Vetor I */

public class Exercise1175 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		int vetor[] = new int[20];
		
		
		for(int i = 0; i < 20; i++) {
			
			int X = leitor.nextInt();
			vetor[i] = X;
		}
		
		int cont = 0;
		
		for(int i = 19; i >= 0; i--) {
			
			System.out.println("N["+cont+"] = " + vetor[i]);
			cont++;
		}
		
		
	}
}
