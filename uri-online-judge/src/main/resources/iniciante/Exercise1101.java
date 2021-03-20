package iniciante;
import java.util.Scanner;

/*
* Mostrar a sequência de Números e Soma
*/

public class Exercise1101 {

	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			
			for(;;) {

				int X = leitor.nextInt();
				int Y = leitor.nextInt();
				
				boolean validacao = X <= 0 || Y <= 0;
				
				if(validacao) {
					break;
				}
					
				int res = 0, i = 0, maior = 0, menor = 0;
				String resposta = "";
				maior = X;
				menor = Y;
				
				if(Y > maior) {
					maior = Y;
					menor = X;
				}
			
				
				for(i = menor; i <= maior; i++ ) {
					
					resposta += i + " ";
					res += i;
				}
				System.out.println(resposta + "Sum="+res);
			}

	}
}