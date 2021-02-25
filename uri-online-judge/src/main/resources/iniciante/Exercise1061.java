package iniciante;

import java.util.Scanner;

/*
* Calcular tempo de um evento
*/

public class Exercise1061 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String caracter;
		int dataCalc = 0;
		
		caracter = leitor.next();
		int diaInicio = leitor.nextInt();
		
		int horaInicio = leitor.nextInt();
		caracter = leitor.next();
		int minutoInicio = leitor.nextInt();
		caracter = leitor.next();
		int segundoInicio = leitor.nextInt();
		
		/*--------------------------------------*/
		
		caracter = leitor.next();
		int diaFinal = leitor.nextInt();
		
		int horaFinal = leitor.nextInt();
		caracter = leitor.next();
		int minutoFinal = leitor.nextInt();
		caracter = leitor.next();
		int segundoFinal = leitor.nextInt();;

		/*--------------------------------------*/
		
		int qtdDia1 = (diaInicio * 3600 * 24) + (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio;
		int qtdDia2 = (diaFinal * 3600 * 24) + (horaFinal * 3600) + (minutoFinal * 60) + segundoFinal;
		

		if(qtdDia1 >= qtdDia2) {
			dataCalc = qtdDia1 - qtdDia2;
		} else {
			dataCalc = qtdDia2 - qtdDia1;
		}
		
		System.out.println((dataCalc/ (3600 * 24))  + " dia(s)");
		dataCalc = dataCalc % (3600 *24);
		System.out.println((dataCalc/ (3600)) + " hora(s)");
		dataCalc = dataCalc % (3600);
		System.out.println((dataCalc/ (60)) + " minuto(s)");
		dataCalc = dataCalc % (60);
		System.out.println(dataCalc + " segundo(s)");

	}
}
