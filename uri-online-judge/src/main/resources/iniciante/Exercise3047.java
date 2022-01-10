package iniciante;
import java.util.Scanner;

/* A idade de Dona Mônica */

public class Exercise3047 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
				
		int idadeMae = leitor.nextInt();
		int idadeFilhoA = leitor.nextInt();
		int idadeFilhoB = leitor.nextInt();
		
		int filhoMaisVelho = idadeFilhoA > idadeFilhoB ?  idadeFilhoA : idadeFilhoB;
		
		int calculoIdadeFilhoC = idadeMae - (idadeFilhoA + idadeFilhoB);
		
		filhoMaisVelho = calculoIdadeFilhoC > filhoMaisVelho ? calculoIdadeFilhoC : filhoMaisVelho;
		
		System.out.println(filhoMaisVelho);
	}
}
