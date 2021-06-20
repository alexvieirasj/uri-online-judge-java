package iniciante;
import java.util.Scanner;

/* Bolinhas de Natal */

public class Exercise3170 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
				
		int bolinha = leitor.nextInt();
		int galho = leitor.nextInt();
		
		int calculoBolinhasPorGalhos = galho / 2;
		
		if(calculoBolinhasPorGalhos > bolinha) {
			System.out.println("Faltam "+ (calculoBolinhasPorGalhos - bolinha) +" bolinha(s)");
		} else {
			System.out.println("Amelia tem todas bolinhas!");
		}

	}
}
