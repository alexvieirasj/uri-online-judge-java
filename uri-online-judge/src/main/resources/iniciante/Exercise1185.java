package iniciante;
import java.util.Scanner;

/* Matriz diagonal principal */

public class Exercise1185 {

	public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
				
		String tipo = leitor.next(); //S = soma ou M = média
		
		int count = 0, decrementoColuna = 11;
		double matriz[][] = new double[12][12], somaOuMedia = 0;
		
		for(int i = 0; i < 12; i++ ) {
			
			for(int j = 0; j < 12; j++ ) {
				
				double valor = leitor.nextDouble();				
				matriz[i][j] = valor;
				
				if(j < decrementoColuna ) {

					if(tipo.equals("S") || tipo.equals("M")) {
						
						somaOuMedia += matriz[i][j];
						count++;
					}
				}
			}	
		    decrementoColuna--;
		}
		
		 if(tipo.equals("M")) {
			 somaOuMedia /= count;
		 }
		
		  System.out.printf("%.1f\n", somaOuMedia);

	}
}
