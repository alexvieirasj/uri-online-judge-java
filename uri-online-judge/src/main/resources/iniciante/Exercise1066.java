package iniciante;

import java.util.Scanner;

/*
* Calcular pares, ímpares, positivos e negativos
*/

public class Exercise1066 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int v1 = leitor.nextInt();
		int v2 = leitor.nextInt();
		int v3 = leitor.nextInt();
		int v4 = leitor.nextInt();
		int v5 = leitor.nextInt();

		int[] array = { v1, v2, v3, v4, v5};
		int contPar = 0, contImpar = 0, contPos = 0, contNeg = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
			
			if (array[i] > 0) {
				contPos++;
			} else if (array[i] < 0) {
				contNeg++;
			}

		}

		System.out.println(contPar + " valor(es) par(es)");
		System.out.println(contImpar + " valor(es) impar(es)");
		System.out.println(contPos + " valor(es) positivo(s)");
		System.out.println(contNeg + " valor(es) negativo(s)");
	}
}
