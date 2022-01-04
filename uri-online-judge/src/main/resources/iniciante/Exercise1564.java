package iniciante;
import java.util.Scanner;

/* Vai Ter Copa? */

public class Exercise1564 {

	public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int reclamacoes;
        
        while (leitor.hasNext()) {
        	reclamacoes = leitor.nextInt();
        	
        	if (reclamacoes == 0) 
        		System.out.println("vai ter copa!");
        	else 
        		System.out.println("vai ter duas!");
        }
        leitor.close();
	}
}
