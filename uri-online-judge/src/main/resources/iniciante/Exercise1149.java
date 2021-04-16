package iniciante;
import java.util.Scanner;

/* Somando inteiros consecutivos */

public class Exercise1149 {
	
	public static void main(String args[]) {
		
		Scanner leitor = new Scanner(System.in);
		
		int contValidador=0, soma=0, i=0, A=0, N=0;
		
		A = leitor.nextInt();
		
		while(N <= 0) {
			N = leitor.nextInt();
		}
				
		//i <= N -1
		for(i = A; contValidador <= (N -1); i++) {
			soma = soma + i;
			contValidador++;
		}
		
		System.out.println(soma);
		
    }
	
}