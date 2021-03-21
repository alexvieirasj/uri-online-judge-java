package iniciante;
import java.util.Scanner;

/* Mostrar divisão de X por Y */

public class Exercise1115 {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int N = leitor.nextInt();
		
		while(N > 0) {
			
			double X = leitor.nextInt();
			double Y = leitor.nextInt();

			String resposta = "";			

			if (Y == 0) {
				System.out.println("divisao impossivel");
			} else if (X == 0) {
				System.out.println(0.0);
			} else {
				double divisao = X/Y;
				System.out.printf("%.1f\n", divisao);
			}
			
			N--;
		}

	}
}