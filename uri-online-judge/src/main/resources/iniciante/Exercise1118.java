package iniciante;
import java.util.Scanner;

/* Mostrar Várias Notas Com Validação */

public class Exercise1118 {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int valoresValidos = 0, continuar = 1;
		double media = 0.0;
		boolean sair = false;
		
		while(continuar != 2) {
			
			double valor = leitor.nextDouble();

			if (valor < 0 || valor > 10) {
				System.out.println("nota invalida");
			} else {
				media += valor;
				valoresValidos++;
			}
			
			if(valoresValidos == 2) {
				System.out.printf("media = %.2f\n", media/=2);
				valoresValidos = 0;
				media = 0;
				
				while(sair != true) {
					
					System.out.println("novo calculo (1-sim 2-nao)");
					continuar = leitor.nextInt();
					
					if(continuar == 1 || continuar == 2) {
						sair = true;
					}
				}
				sair = false;
			}	
			
		}
		
	}
}