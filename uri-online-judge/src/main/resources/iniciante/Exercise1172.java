package iniciante;
import java.util.Scanner;

/* Substitui��o em Vetor I */

public class Exercise1172 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			int X = leitor.nextInt();
			
			if(X <= 0) {
				System.out.println("X["+i+"] = "+1);
			} else {
				System.out.println("X["+i+"] = "+X);
			}
		}
		
	}
}
