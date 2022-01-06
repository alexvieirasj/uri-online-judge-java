package iniciante;
import java.util.Scanner;

/* Ho Ho Ho */

public class Exercise1759 {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int quantidade = leitor.nextInt();
		
		if(quantidade >= 0 && quantidade <= 1000000) {
			for(int i=1; i<quantidade; i++) {
				 System.out.print("Ho" + " ");
			}
	     	System.out.println("Ho" + "!");			
		}
		leitor.close();
	}
}
