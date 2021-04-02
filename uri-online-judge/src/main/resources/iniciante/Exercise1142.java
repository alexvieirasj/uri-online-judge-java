package iniciante;
import java.util.Scanner;

/* Ler sequência lógica */

public class Exercise1142 {
	
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int N = leitor.nextInt();
		int save = 0, value = 1;
		String retorno = "";

		while(N > 0) {
			
			for(int i = value; i < (value+3); i++) {
				save = i;
				retorno += i + " ";
			}
			
			System.out.println(retorno + "PUM");	
			retorno = "";
			value = save + 2;
		
			N--;
		}
	}
}