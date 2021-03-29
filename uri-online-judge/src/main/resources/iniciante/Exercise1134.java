package iniciante;
import java.util.Scanner;

/* Ler tipos de combustiveis colocados pelos clientes */

public class Exercise1134 {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
				
		int alcool = 0, gasolina = 0, diesel = 0, valor = 0;
		
		do {
		  
		  valor = leitor.nextInt();
		  
		  if(valor == 1) {
			  alcool++;
		  } else if(valor == 2) {
			  gasolina++;
		  } else if(valor == 3) {
			  diesel++;
		  }
		  
		} while(valor != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " +  gasolina);
		System.out.println("Diesel: " + diesel);
		
	}
}