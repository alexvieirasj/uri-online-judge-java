package iniciante;
import java.util.Scanner;

/* A Saída */

public class Exercise2861 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
				
		int numeroCasos = leitor.nextInt();
		
		while(numeroCasos > 0) {
			
			String pergunta = leitor.next();
			
			String resposta = "gzuz";
			
			System.out.println(resposta);
			numeroCasos--;
		}
		
	}
}
