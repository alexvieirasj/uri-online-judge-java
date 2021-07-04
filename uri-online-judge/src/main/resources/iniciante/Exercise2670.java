package iniciante;
import java.util.Scanner;

/* Máquina de Café */

public class Exercise2670 {

	public static void main(String args[]) {
		
		Scanner leitor = new Scanner(System.in);
		int primeiroAndar = 0, segundoAndar = 0, terceiroAndar = 0, minutos = 0;
		
		for(int i = 1; i <= 3; i++) {
			
			int pessoaPorAndar = leitor.nextInt();

			primeiroAndar = i == 1 ? pessoaPorAndar : primeiroAndar;
			segundoAndar  = i == 2 ? pessoaPorAndar : segundoAndar;
			terceiroAndar = i == 3 ? pessoaPorAndar : terceiroAndar;
		}
		leitor.close();  
		
		if ((segundoAndar >= primeiroAndar && segundoAndar >= terceiroAndar))
			minutos = (primeiroAndar + terceiroAndar ) * 2;
        else if ( terceiroAndar >= segundoAndar && (primeiroAndar + segundoAndar) <= terceiroAndar)
        	minutos = (primeiroAndar * 4) + (segundoAndar * 2);
        else if ( primeiroAndar >= terceiroAndar && (segundoAndar + terceiroAndar) <= primeiroAndar)
        	minutos = (segundoAndar * 2) + (terceiroAndar * 4);
        else 
        	minutos = (primeiroAndar + terceiroAndar ) * 2;
        System.out.println(minutos);
		
		
	}
}
