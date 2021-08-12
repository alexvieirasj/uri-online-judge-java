package iniciante;
import java.util.Scanner;

/* Feijão */

public class Exercise2791 {

	public static void main(String args[]) {
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 1; i <= 4; i++) {
			
			int copo = leitor.nextInt();
			boolean feijaoNoCopo = copo == 1;
			
			if(feijaoNoCopo) {
				System.out.println(i);
			}
		}
	
	}
}
