package iniciante;

import java.util.Scanner;

/*
* Calcular pares entre 5 números
*/

public class Exercise1065 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int v1 = leitor.nextInt();
		int v2 = leitor.nextInt();
		int v3 = leitor.nextInt();
		int v4 = leitor.nextInt();
		int v5 = leitor.nextInt();

		int[] array = { v1, v2, v3, v4, v5};
		int cont = 0;
		float media = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				cont++;
			}

		}

		System.out.println(cont + " valores pares");
	}
}
