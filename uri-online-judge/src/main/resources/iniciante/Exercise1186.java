package iniciante;
import java.util.Scanner;

/* Matriz diagonal principal */

public class Exercise1186 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
				
		String tipo = leitor.next(); //S = soma ou M = média
		
		int count = 0, value = 0;
		double matriz[][] = new double[12][12], somaOuMedia = 0;
		
		for(int i = 0; i < 12; i++ ) {
			
			value = 11 - i;
			for(int j = 0; j < 12; j++ ) {
				
				double valor = leitor.nextDouble();				
				matriz[i][j] = valor;
				
				if( (i == 0 ) || (j == 0) ) {

				} else {

				    if( j > value ) {

						if(tipo.equals("S") || tipo.equals("M")) {
							
							somaOuMedia += matriz[i][j];
							count++;
						}
					} 
				}  
			}	
		}
		
		 if(tipo.equals("M")) {
			 somaOuMedia /= count;
		 }
		
		  System.out.printf("%.1f\n", somaOuMedia);

	}
}
