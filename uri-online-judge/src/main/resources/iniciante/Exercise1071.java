package iniciante;

import java.util.Scanner;

/*
* Mostrar a soma de n�meros �mpares entre dois n�meros
*/

public class Exercise1071 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int X = leitor.nextInt();
		int Y = leitor.nextInt();
		int res = 0, i = 0, maior = 0, menor = 0;
		
		maior = X;
		menor = Y;
		
		if(Y > maior) {
			maior = Y;
			menor = X;
		}
	
		
		for(i = menor+1; i < maior; i++ ) {
			if(i % 2 != 0) {
				res += i;
			}
		}
		
		System.out.println(res);
	}
}