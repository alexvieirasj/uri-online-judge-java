package iniciante;

import java.util.Scanner;

/* Sequência S II */

public class Exercise1156 {

	public static void main(String args[]) {

		double S = 1.0 + (3.0 / 2.0);
		double c = 3.0, b = 2.0;

		while (c <= 39) {

			c += 2.0;
			b *= 2.0;
			
			S = S + (c / b);
		}

		System.out.printf("%.2f\n", S);

	}
}
