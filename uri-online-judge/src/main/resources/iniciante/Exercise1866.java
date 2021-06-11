package iniciante;
import java.util.Scanner;

/* Conta da Lanchonete */

public class Exercise1866 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
				
		int casosTeste = leitor.nextInt(), calculo = 0;
		
		while(casosTeste > 0) {
			
			int valor = leitor.nextInt();
			
			for(int i = 1; i <= valor; i++) {
				
				if(i % 2 == 0) {
					calculo += -1;
				} else {
					calculo += 1;
				}
			}
			
			System.out.println(calculo);
			calculo = 0;
			casosTeste--;
		}		
		
	}
}
