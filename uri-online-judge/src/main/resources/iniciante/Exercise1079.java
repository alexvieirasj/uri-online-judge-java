package iniciante;

import java.util.Scanner;

/*
* Calcular médias ponderadas
*/

public class Exercise1079 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int n = leitor.nextInt();
	
		for (int i = 1; i <= n; i++) {
			
			float v1 = leitor.nextFloat();
			float v2 = leitor.nextFloat();
			float v3 = leitor.nextFloat();
			
			double mediaPonderada = ((v1 * 2.0) / 10) + ((v2 * 3.0) / 10) + ((v3 * 5.0) / 10);
	        
	        System.out.printf("%.1f\n", mediaPonderada);
		}
	}

}