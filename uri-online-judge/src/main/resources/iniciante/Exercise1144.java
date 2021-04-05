package iniciante;
import java.util.Scanner;

/* Ler sequência lógica quadrado e ao cubo */

public class Exercise1144 {
	
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int valor = leitor.nextInt();
       
		for(int i = 1; i <= valor; i++) {
			int val2 = (int) Math.pow(i, 2);
			int val3 = (int) Math.pow(i, 3);
			
			System.out.println(i  + " " + val2  + " " + val3 );
			System.out.println(i  + " " + (val2 + 1 )  + " " + (val3 + 1 ) );
		}
	}
}