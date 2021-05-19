package iniciante;
import java.util.Scanner;

/* Seleçao em Vetor I */

public class Exercise1174 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		double vetor[] = new double[100];
		
		
		for(int i = 0; i < 100; i++) {
			
			double X = leitor.nextDouble();

			if(X <= 10.0) {
				System.out.println("A["+i+"] = " + String.format("%.1f", X));
			}
			vetor[i] = X;
		}
		
	}
}
