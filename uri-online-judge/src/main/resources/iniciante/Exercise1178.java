package iniciante;
import java.util.Scanner;

/* Preenchimento de Vetor III */

public class Exercise1178 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);

		double X = leitor.nextDouble(); 
		
		double vetor[] = new double[100];

		for (int j = 0; j < 100; j++) {

			if(j == 0) {
				vetor[j] = X;
			    System.out.println("N[" + j + "] = " + String.format("%.4f", vetor[j]));
			} else { 
				vetor[j] = vetor[j-1] /2;
			    System.out.println("N[" + j + "] = " + String.format("%.4f", vetor[j]));
			}
		}

	}
}
