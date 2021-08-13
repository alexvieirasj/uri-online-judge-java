package iniciante;
import java.util.Scanner;

/* A idade de Dona Mônica */

public class Exercise2862 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
				
		int numeroCasos = leitor.nextInt();
		
		while(numeroCasos > 0) {
			
			int valor = leitor.nextInt();
			
			String maiorQue8000 = valor > 8000 ? "Mais de 8000!" : "Inseto!";
			
			System.out.println(maiorQue8000);
			numeroCasos--;
		}
		
	}
}
