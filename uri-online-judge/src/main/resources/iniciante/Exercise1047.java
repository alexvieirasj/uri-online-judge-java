package iniciante;

import java.util.Scanner;
import java.util.Arrays;
/*
* Calcular tempo de jogo com minutos
*/

public class Exercise1047 {

	 public static void main(String[] args) {
		 	Scanner leitor = new Scanner(System.in);

	        int horaInicio = leitor.nextInt();
	        int minutoInicial = leitor.nextInt();
	        int horaFim = leitor.nextInt();
	        int minutoFinal = leitor.nextInt();

	        if (minutoInicial > minutoFinal) {
	            int minutoTotal = 60 - (minutoInicial - minutoFinal);
	            
	            if (horaInicio > horaFim) {
	                int total = ((24 - horaInicio) + horaFim - 1);
	                System.out.println("O JOGO DUROU "+total+" HORA(S) E "+minutoTotal+" MINUTO(S)");

	            } else if (horaFim > horaInicio) {
	                int total = (horaFim - horaInicio) - 1;
	                System.out.println("O JOGO DUROU "+total+" HORA(S) E "+minutoTotal+" MINUTO(S)");

	            } else if (horaInicio == horaFim) {
	                int total = 24 - 1;
	                System.out.println("O JOGO DUROU "+total+" HORA(S) E "+minutoTotal+" MINUTO(S)");
	            }
	        } else if (minutoFinal > minutoInicial) {
	            int minutoTotal = (minutoFinal - minutoInicial);
	            
	            if (horaInicio > horaFim) {
	                int total = (24 - horaInicio) + horaFim;
	                System.out.println("O JOGO DUROU "+total+" HORA(S) E "+minutoTotal+" MINUTO(S)");

	            } else if (horaFim > horaInicio) {
	                int total = horaFim - horaInicio;
	                System.out.println("O JOGO DUROU "+total+" HORA(S) E "+minutoTotal+" MINUTO(S)");

	            } else if (horaInicio == horaFim) {
	                int total = 24;
	                System.out.println("O JOGO DUROU "+total+" HORA(S) E "+minutoTotal+" MINUTO(S)");
	            }
	            
	            
	        } else if (minutoInicial == minutoFinal) {
	            int minutoTotal = 0;
	            
	            if (horaInicio > horaFim) {
	                int total = (24 - horaInicio) + horaFim;
	                System.out.println("O JOGO DUROU "+total+" HORA(S) E "+minutoTotal+" MINUTO(S)");

	            } else if (horaFim > horaInicio) {
	                int total = horaFim - horaInicio;
	                System.out.println("O JOGO DUROU "+total+" HORA(S) E "+minutoTotal+" MINUTO(S)");

	            } else if (horaInicio == horaFim) {
	                int total = 24;
	                System.out.println("O JOGO DUROU "+total+" HORA(S) E "+minutoTotal+" MINUTO(S)");
	            }
	        }
	    }
	}
