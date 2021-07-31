package iniciante;
import java.util.Scanner;

/* Desafio de Bino */

public class Exercise2060 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
				
		int casosTeste = leitor.nextInt(), multiplos2 = 0, multiplos3 = 0, multiplos4 = 0, multiplos5 = 0;
		
		while(casosTeste > 0) {
			
			int valor = leitor.nextInt();

			if(valor % 2 == 0) {
				multiplos2++;
			}
			if(valor % 3 == 0) {
				multiplos3++;
			}
			if(valor % 4 == 0) {
				multiplos4++;
			}
			if(valor % 5 == 0) {
				multiplos5++;
			}
			casosTeste--;
		}		
		
		System.out.println(multiplos2 + " Multiplo(s) de 2");
		System.out.println(multiplos3 + " Multiplo(s) de 3");
		System.out.println(multiplos4 + " Multiplo(s) de 4");
		System.out.println(multiplos5 + " Multiplo(s) de 5");
	}
}
