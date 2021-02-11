package iniciante;

import java.util.Scanner;
import java.util.Arrays;
/*
* Calcular tempo de jogo
*/

public class Exercise1046 {

	 public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
	        
	        int horaInicio = leitor.nextInt();
	        int horaFim = leitor.nextInt();
	        
	        if(horaInicio > horaFim)
	        {
	            int total = (24 - horaInicio) + horaFim;
	            System.out.println("O JOGO DUROU "+total+" HORA(S)");
	        }
	        else if(horaFim > horaInicio)
	        {
	             int total = horaFim - horaInicio;
	            System.out.println("O JOGO DUROU "+total+" HORA(S)");
	        }
	        else if(horaInicio == horaFim)
	        {
	            int total = 24;
	            System.out.println("O JOGO DUROU "+total+" HORA(S)");
	        }
	    }
	}
