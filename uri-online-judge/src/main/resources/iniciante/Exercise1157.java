package iniciante;
import java.util.Scanner;

/* Divisores I */

public class Exercise1157 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);

		int valor = leitor.nextInt();
		
		for(int i=1; i <=valor; i++) {
			
			if(valor % i == 0) {
				System.out.println(i);
			}
		}

	}
}
