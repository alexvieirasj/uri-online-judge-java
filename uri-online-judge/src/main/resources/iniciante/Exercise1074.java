package iniciante;

import java.util.Scanner;

/*
* Verifica pares e ímpares
*/

public class Exercise1074 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int N = leitor.nextInt();
		int valor;

		while (N > 0) {
			valor = leitor.nextInt();
			if (valor == 0) {
				System.out.println("NULL");
			} else if (valor % 2 == 0) {
				if (valor != 0) {
					System.out.print("EVEN ");
				}
				if (valor > 0) {
					System.out.print("POSITIVE\n");
				}
				if (valor < 0) {
					System.out.print("NEGATIVE\n");
				}

			} else if (valor % 2 != 0) {
				if (valor != 0) {
					System.out.print("ODD ");
				}
				if (valor > 0) {
					System.out.print("POSITIVE\n");
				}
				if (valor < 0) {
					System.out.print("NEGATIVE\n");
				}

			}
			N--;
		}
	}
}
