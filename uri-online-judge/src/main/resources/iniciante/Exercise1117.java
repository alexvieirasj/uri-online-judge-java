package iniciante;
import java.util.Scanner;

/* Mostrar validação da nota */

public class Exercise1117 {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int N = 2;
		double media = 0.0;
		
		while(N > 0) {
			
			double valor = leitor.nextDouble();

			if (valor < 0 || valor > 10) {
				System.out.println("nota invalida");
			} else {
				media += valor;
				N--;
			}
		}
		System.out.printf("media = %.2f\n", media/=2);
	}
}