package iniciante;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

/* Crescimento Populacional */

public class Exercise1160 {

	public static void main(String args[]) throws ParseException {

		Scanner leitor = new Scanner(System.in);
		
		int numTestes = leitor.nextInt(), anos;		

		NumberFormat format = NumberFormat.getInstance(Locale.US);
		
		for (int i = 0; i < numTestes; i++) {
			
			anos = 101;
			
			int PA = leitor.nextInt();
			int PB = leitor.nextInt();
			double G1 = format.parse(leitor.next()).doubleValue();
			double G2 = format.parse(leitor.next()).doubleValue();
			
			for (int j = 0; j < 100; j++) {
				
				PA = (int) ((1 + (G1 / 100)) * PA);
				PB = (int) ((1 + (G2 / 100)) * PB);
				
				if (PA > PB) {
					anos = (j + 1);
					break;
				}
			}
			
			if (anos > 100) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.println(anos + " anos.");
			}
			
		}
		
		leitor.close();
	}
}
