package iniciante;

import java.util.Scanner;

/*
* Mostrar 6 números ímpares consecutivos
*/

public class Exercise1070 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int X = leitor.nextInt();
		int res = 0;
		int i;
		if (X % 2 == 0) {
			res = X + 1;
		} else {
			res = X;
		}

		System.out.println(res);
		for (i = 2; i <= 6; i++) {
			System.out.println(res += 2);
		}
	}
}