package iniciante;

import java.util.Scanner;

/*
* Mostrar experiências
*/

public class Exercise1094 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int numero = leitor.nextInt();
		int SomaQtd = 0, SomaCoelho = 0, SomaRato = 0, SomaSapo = 0;
		float PercCoelho = 0, PercRato = 0, PercSapo = 0;
		
		
		while(numero > 0) {
			
			int quantia = leitor.nextInt();
			String tipo = leitor.next();
			
			SomaQtd += quantia;
			
			if(tipo.equals("C")) {
				SomaCoelho += quantia;
			} else if(tipo.equals("R")) {
				SomaRato += quantia;
			} else if(tipo.equals("S")) {
				SomaSapo += quantia;
			}  
			
			numero--;
		}
		
		PercCoelho = (float) (SomaCoelho * 100.00) / SomaQtd; 
		PercRato = (float) (SomaRato * 100.00) / SomaQtd;  
		PercSapo = (float) (SomaSapo * 100.00) / SomaQtd;  
		
		System.out.println("Total: " + SomaQtd + " cobaias");
		System.out.println("Total de coelhos: " + SomaCoelho);
		System.out.println("Total de ratos: " + SomaRato);
		System.out.println("Total de sapos: " + SomaSapo);		
		System.out.printf("Percentual de coelhos: %.2f", PercCoelho);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f", PercRato);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f", PercSapo);
		System.out.print(" %\n");		
	}

}