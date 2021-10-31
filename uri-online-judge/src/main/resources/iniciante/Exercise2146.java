package iniciante;
import java.util.Scanner;

/* Senha */

public class Exercise2146 {

	public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
		
		while (leitor.hasNext()) { 
			int n = leitor.nextInt();
			int senha = n - 1;
				
			System.out.println(senha);	
		 }
	}
}
