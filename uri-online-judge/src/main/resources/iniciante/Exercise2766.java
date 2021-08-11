package iniciante;
import java.util.Scanner;

/* Entrada e Saída Lendo e Pulando Nomes */

public class Exercise2766 {

	public static void main(String args[]) {
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			
			String nome = leitor.next();
			boolean terceiraLinha = i == 3;
			boolean setimaLinha = i == 7;
			boolean nonaLinha = i == 9;			
			
			if(terceiraLinha) {
				System.out.println(nome);
			}
			else if(setimaLinha) {
				System.out.println(nome);
			}
			else if(nonaLinha) {
				System.out.println(nome);
			}
			
		}
	
	}
}
