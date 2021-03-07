package iniciante;

import java.util.Scanner;

/*
* Verificar resto
*/

public class Exercise1075 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int n = leitor.nextInt();
		
		for(int i = 1; i <= 10000; i++) {
			
			if( i % n == 2 ) {
				System.out.println(i);
			}
		}
	}
}
