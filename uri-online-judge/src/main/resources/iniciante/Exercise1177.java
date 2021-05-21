package iniciante;

import java.util.Scanner;

/* Preenchimento de Vetor II */

public class Exercise1177 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);

		int X = leitor.nextInt(), cont = 0;

		int vetor[] = new int[X];

		for (int k = 0; k < X; k++) {
			vetor[k] = k;
		}

		for (int j = 0; j < 1000; j++) {

			System.out.println("N[" + j + "] = " + vetor[cont]);
			cont++;

			if (cont == X)
				cont = 0;
		}

	}
}
