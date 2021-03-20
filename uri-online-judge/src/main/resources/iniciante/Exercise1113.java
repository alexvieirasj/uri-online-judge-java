package iniciante;
import java.util.Scanner;

/*
* Mostrar se valores foram digitados em ordem crescente ou decrescente
*/

public class Exercise1113 {

	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			
			for(;;) {

				int X = leitor.nextInt();
				int Y = leitor.nextInt();
				
				boolean validacao = X == Y;
				
				if(validacao) {
					break;
				}
					
				int primeiro = 0, segundo = 0;
				String resposta = "";
				primeiro = X;
				segundo = Y;
				
				if(primeiro > segundo) {
					resposta = "Decrescente";
				} else {
					resposta = "Crescente";
				}
				
				System.out.println(resposta);
			}

	}
}