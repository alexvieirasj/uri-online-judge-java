package iniciante;
import java.util.Scanner;

import org.checkerframework.checker.units.qual.Length;

/* Linha na Matriz */

public class Exercise1181 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		int linha = leitor.nextInt();
		String tipo = leitor.next(); //S = soma ou M = média

		double matriz[][] = new double[12][12], somaOuMedia = 0;
		
		for(int i = 0; i < 12; i++ ) {
			
			for(int j = 0; j < 12; j++ ) {
				
				double valor = leitor.nextDouble();				
				matriz[i][j] = valor;
				
				if(linha == i) {
					
					if(tipo.equals("S") || tipo.equals("M")) {
						somaOuMedia += matriz[i][j];
					}
				}
			}
		}
		
		 if(tipo.equals("M")) {
			 somaOuMedia /= matriz[linha].length;
		 }
		
		  System.out.printf("%.1f\n", somaOuMedia);

		
	}
}
