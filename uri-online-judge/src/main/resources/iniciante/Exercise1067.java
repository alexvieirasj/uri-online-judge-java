package iniciante;

import java.util.Scanner;

/*
* Mostrar n�meros �mpares antecessores at� o n�mero
*/

public class Exercise1067 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int v1 = leitor.nextInt();

		for (int i = 0; i <= v1; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
