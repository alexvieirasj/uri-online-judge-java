package iniciante;

import java.util.Scanner;

/*
* Calcular maior valor e a posição
*/

public class Exercise1080 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

	    int maior = 0, pos = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			int valor = leitor.nextInt();
			
			if(valor > maior) {
				maior = valor;
				pos = i;
			}	
		}
		
		System.out.println(maior);
		System.out.println(pos);
	}

}