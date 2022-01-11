package iniciante;
import java.util.Scanner;

/* Nota esquecida */

public class Exercise3055 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
				
		int notaA = leitor.nextInt();
		int media = leitor.nextInt();
		
		int calculoNotaB = (media * 2) - notaA;
		
		System.out.println(calculoNotaB);
	}
}
