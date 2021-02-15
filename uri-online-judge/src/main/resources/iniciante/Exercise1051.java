package iniciante;

import java.util.Scanner;
/*
* Calcular imposto de renda
*/

public class Exercise1051 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float valor = leitor.nextFloat();
		float imposto = 0;
		float resto28 = 0;
		float resto18 = 0;
		float resto8 = 0;

		if (valor >= 0 && valor <= 2000.00) {

		} else if (valor >= 2000.01 && valor <= 3000.00) {

			resto8 = valor - 2000; // 8%
			imposto = (resto8 * 8) / 100;

		} else if (valor >= 3000.01 && valor <= 4500.00) {

			resto18 = (valor - 3000); // 18%
			resto8 = (valor - 2000) - resto18; // 8%

			imposto = ((resto8 * 8) / 100) + ((resto18 * 18) / 100);

		} else if (valor > 4500.00) {

			resto28 = (valor - 4500); // 28%
			resto18 = (valor - 3000) - resto28; // 18%
			resto8 = (valor - 2000) - resto18 - resto28; // 8%
			
			imposto = ((resto8 * 8) / 100) + ((resto18 * 18) / 100) + ((resto28 * 28) / 100);
		}

		if (imposto > 0.0) {
			System.out.printf("R$ %.2f\n", imposto);
		} else {
			System.out.println("Isento");
		}

	}
}
