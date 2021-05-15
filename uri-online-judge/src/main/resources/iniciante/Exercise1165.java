package iniciante;
import java.util.Scanner;

/* Número Primo */

public class Exercise1165 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		int numTestes = leitor.nextInt();
		
		for(int i = 1; i <= numTestes; i++ ) {
			
			int X = leitor.nextInt(), somaDivisores = 1;

			for(int j=2; j <= X; j++ ) {
				
				if(X % j == 0){
					somaDivisores++;
				}	
			}
			
			if(somaDivisores == 2) {
				System.out.println(X + " eh primo");
			} else {
				System.out.println(X + " nao eh primo");
			}
		}
		
		
	}
}
