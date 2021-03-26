package iniciante;
import java.util.Scanner;

/* Mostrar dados dos grenais */

public class Exercise1131 {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int vitoriasInter = 0, vitoriasGremio = 0, empates = 0, qtdGrenais = 0, continuar = 0;
		boolean sair = false;
		
		while(continuar != 2) {
			
			int golsInter = leitor.nextInt();
			int golsGremio = leitor.nextInt();

			if (golsInter > golsGremio ) {				
				vitoriasInter++;
			} else if (golsGremio > golsInter ) {
				vitoriasGremio++;
			} else {
				empates++;
			}
			qtdGrenais ++;

			System.out.println("Novo grenal (1-sim 2-nao)");
			continuar = leitor.nextInt();			
		}
		
		String maiorVencedor = vitoriasInter > vitoriasGremio ? "Inter venceu mais" : 
			(vitoriasGremio > vitoriasInter  ? "Gremio venceu mais" : "Nao houve vencedor");
		
		System.out.println(qtdGrenais + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		System.out.println(maiorVencedor);		
	}
}