package iniciante;
import java.util.Scanner;

/* Ultrapassando Z */

public class Exercise1150 {
	
	public static void main(String args[]) {
		
		Scanner leitor = new Scanner(System.in);
		
		int Z = 0, cont = 2, soma = 0;
		int X = leitor.nextInt();
		boolean sair = false;
		
		do {			
			Z = leitor.nextInt();			
		} while(Z <= X);
		
		soma = X;
		while(sair == false) {
			
			soma = soma + (soma + 1);
			cont++;
			
			if(soma > Z) {
				sair = true;
			}
		}
		
		System.out.println(cont);
		
    }
	
}