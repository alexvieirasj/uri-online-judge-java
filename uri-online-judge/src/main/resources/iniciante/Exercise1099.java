package iniciante;
import java.util.Scanner;

/*
* Mostrar a soma de n�meros �mpares entre dois n�meros II
*/

public class Exercise1099 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int N = leitor.nextInt();
		
		while(N > 0) {
			
			int X = leitor.nextInt();
			int Y = leitor.nextInt();
			
			int res = 0, i = 0, maior = 0, menor = 0;
			
			maior = X;
			menor = Y;
			
			if(Y > maior) {
				maior = Y;
				menor = X;
			}
		
			
			for(i = menor+1; i < maior; i++ ) {
				if(i % 2 != 0) {
					res += i;
				}
			}
			
			System.out.println(res);
			
			N--;
		}
		
	}
}