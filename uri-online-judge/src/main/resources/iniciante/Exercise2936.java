package iniciante;
import java.util.Scanner;

/* Refeição da Dona Chica */

public class Exercise2936 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
			
		int curupira = leitor.nextInt() * 300;
		int boitata = leitor.nextInt() * 1500;
		int boto = leitor.nextInt() * 600;
		int mapinguari = leitor.nextInt() * 1000;
		int iara = leitor.nextInt() * 150;
		
		int donaChica = 225;
		
		int calculaRefeicao = curupira + boitata + boto + mapinguari + iara + donaChica;
		
		System.out.println(calculaRefeicao);
	}
}
