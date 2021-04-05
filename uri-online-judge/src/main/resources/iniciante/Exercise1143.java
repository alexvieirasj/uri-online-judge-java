package iniciante;
import java.util.Scanner;

/* Calcular numero ao quadrado e ao cubo */

public class Exercise1143 {
	
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int valor = leitor.nextInt();

		for(int i = 1; i <= valor; i++) {
			System.out.println(i  + " " + (int) Math.pow(i, 2)  + " " + (int) Math.pow(i, 3));
		}
	}
}