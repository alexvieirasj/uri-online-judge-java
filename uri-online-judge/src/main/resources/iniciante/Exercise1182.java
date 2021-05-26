package iniciante;
import java.util.Scanner;

/* Coluna na Matriz */

public class Exercise1182 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		int coluna = leitor.nextInt();
		String tipo = leitor.next(); //S = soma ou M = média

		double matriz[][] = new double[12][12], somaOuMedia = 0;
		
		for(int i = 0; i < 12; i++ ) {
			
			for(int j = 0; j < 12; j++ ) {
				
				double valor = leitor.nextDouble();				
				matriz[i][j] = valor;
				
				if(coluna == j) {
					
					if(tipo.equals("S") || tipo.equals("M")) {
						somaOuMedia += matriz[i][j];
					}
				}
			}
		}
		
		 if(tipo.equals("M")) {
			 somaOuMedia /= matriz[coluna].length;
		 }
		
		  System.out.printf("%.1f\n", somaOuMedia);

	}
}
