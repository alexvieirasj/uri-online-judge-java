package iniciante;

import java.util.Scanner;

/*
* Calcular valores positivos e m�dia
*/

public class Exercise1064 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float v1 = leitor.nextFloat();
		float v2 = leitor.nextFloat();
		float v3 = leitor.nextFloat();
		float v4 = leitor.nextFloat();
		float v5 = leitor.nextFloat();
		float v6 = leitor.nextFloat();

		Float[] array = { v1, v2, v3, v4, v5, v6 };
		int cont = 0;
		float media = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] >= 0) {
				cont++;
				media += array[i];
			}

		}

		System.out.println(cont + " valores positivos");
		System.out.printf("%.1f\n", (media / cont));
	}
}
