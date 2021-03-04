package iniciante;

import java.util.Scanner;

/*
* Soma dos números dentro e fora do intervalo entre 10 e 20
*/

public class Exercise1072 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int valor = leitor.nextInt();
		int contIn = 0, contOut = 0;
				
		for(int i = 0; i < valor; i++) {
			
			 int newValue = leitor.nextInt();
			 
			 if(newValue >= 10 && newValue <= 20) {
				 contIn++;
			 } else {
				 contOut++;
			 }			 
		}
		
		System.out.println(contIn + " in");
		System.out.println(contOut + " out");
	}
}