package iniciante;
import java.util.Scanner;

/* Preenchimento de Vetor IV */

public class Exercise1179 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		int vetorPar[] = new int[5];
		int vetorImPar[] = new int[5];
		int contPar = 0, contImpar = 0;

		for (int j = 0; j < 15; j++) {
			
			int valor = leitor.nextInt(); 
			
			if(valor % 2 == 0) {
				vetorPar[contPar] = valor;
			    contPar++;
			} else {
				vetorImPar[contImpar] = valor;
				contImpar++;
			}
			
			
			if(contPar == 5) {
				
				for (int k = 0; k < vetorPar.length; k++) {
					 System.out.println("par[" + k + "] = " + vetorPar[k]);
				} 
				contPar = 0;
			}
			
			if(contImpar == 5) {

				for (int k = 0; k < vetorImPar.length; k++) {
					 System.out.println("impar[" + k + "] = " + vetorImPar[k]);
				} 
				contImpar = 0;
			}
			
		}
		
		for (int i = 0; i < contImpar; i++) {
			 System.out.println("impar[" + i + "] = " + vetorImPar[i]);			
		}
		
		for (int i = 0; i < contPar; i++) {
			 System.out.println("par[" + i + "] = " + vetorPar[i]);			
		}
		
	}
}
