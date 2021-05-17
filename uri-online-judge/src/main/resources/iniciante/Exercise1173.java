package iniciante;
import java.util.Scanner;

/* Preenchimento de Vetor I */

public class Exercise1173 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int X = leitor.nextInt();
		
		for(int i = 0; i < 10; i++) {
			
			if(i == 0) {
				System.out.println("N["+i+"] = " + (vetor[i] = X));
			} else {
				System.out.println("N["+i+"] = " + (vetor[i] = vetor[i-1] * 2));
			}
		}
		
	}
}
