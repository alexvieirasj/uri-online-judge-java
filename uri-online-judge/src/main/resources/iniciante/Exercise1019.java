package iniciante;

import java.util.Scanner;
/*
* Calcular conversão de tempo
*/

public class Exercise1019 {

	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);

		    int tempo = scan.nextInt();
		    int resto = tempo;
		    
		    int hora = tempo / 3600;
		    resto = resto - (hora * 3600);

		    int minuto =  resto / 60;
		    resto = resto - (minuto * 60);

		    int segundo = resto;
		    resto = resto - (segundo * 1);
		    
		    System.out.println(hora + ":" + minuto + ":" + segundo);
	  }
}
