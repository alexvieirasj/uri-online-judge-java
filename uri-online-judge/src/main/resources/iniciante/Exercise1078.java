package iniciante;

import java.util.Scanner;

/*
* Calcular a tabuada
*/

public class Exercise1078 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int i, tabuada = 0, N;

		N = leitor.nextInt();

		for (i = 1; i <= 10; i++) {
			tabuada = i * N;
			System.out.println(i + " x " + N + " = " + tabuada);
		}
	}

}