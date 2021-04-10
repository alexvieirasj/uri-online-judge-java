package iniciante;
import java.util.Scanner;

/* Ler sequência lógica números crescentes */

public class Exercise1146 {
	
	public static void main(String args[]) {
		
		Scanner leitor = new Scanner(System.in);
		boolean sair = false;
		
		while(sair == false) {
			
			int X = leitor.nextInt();
			
			if(X == 0) {
				sair = true;
			} else {
				
				for (int i = 1; i <= X; i++) {
					
					if (i == X) {
						System.out.print(i+"\n");
					} else {
						System.out.print(i+" ");
					}
				}
			}
						
		}
    }
	
}