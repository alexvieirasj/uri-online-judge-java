package iniciante;
import java.util.Scanner;

/* Número Perfeito */

public class Exercise1164 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		int numTestes = leitor.nextInt();
		
		for(int i=1; i <= numTestes; i++ ) {
			
			int valor = leitor.nextInt(), somaDivisores = 0;			
			
			for(int j=1; j < valor; j++ ) {
				
				if(valor % j == 0){
					somaDivisores += j;
				}				
			}
			
			if(somaDivisores == valor) {
				System.out.println(valor + " eh perfeito");
			} else {
				System.out.println(valor + " nao eh perfeito");
			}
			
		}

	}
}
