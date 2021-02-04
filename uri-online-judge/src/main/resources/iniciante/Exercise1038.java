package iniciante;

import java.util.Scanner;
/*
* Calcular valor do lanche
*/

public class Exercise1038 {

	 public static void main(String[] args) {
		 	Scanner scan = new Scanner(System.in);
		 	
		 	int codigo = scan.nextInt();
		 	int quantidade = scan.nextInt();
		 	
		 	switch(codigo) {
			 	case 1:
		 			System.out.printf("Total: R$ %.2f\n", (quantidade * 4.0));
		 			break;
			 	case 2:
		 			System.out.printf("Total: R$ %.2f\n", (quantidade * 4.5));
		 			break;
			 	case 3:
		 			System.out.printf("Total: R$ %.2f\n", (quantidade * 5.0));
		 			break;
			 	case 4:
		 			System.out.printf("Total: R$ %.2f\n", (quantidade * 2.0));
		 			break;
			 	case 5:
		 			System.out.printf("Total: R$ %.2f\n", (quantidade * 1.5));
		 			break;		 		
		 	}
	 }
}
