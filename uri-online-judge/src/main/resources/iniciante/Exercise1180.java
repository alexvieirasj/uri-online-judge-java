package iniciante;
import java.util.Scanner;

/* Menor e Posição */

public class Exercise1180 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		int tam = leitor.nextInt(), menorValor = 0, posicao = 0;
		
		int vetor[] = new int[tam];
		
		for(int i = 0; i < tam; i++ ) {
			
			int valor = leitor.nextInt();
			
			vetor[i] = valor;
			
			if(i==0) {
				menorValor = valor;
				posicao = i;
			}
			
			if(vetor[i] < menorValor) {
				menorValor = vetor[i];
				posicao = i;
			}
		}
		
		System.out.println("Menor valor: " + menorValor);
		System.out.println("Posicao: " + posicao);
	}
}
