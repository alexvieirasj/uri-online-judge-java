package iniciante;

import java.util.Scanner;
/*
* Verificar se os n�meros s�o mult�plos ou n�o
*/

public class Exercise1044 {

	 public static void main(String[] args) {
		 	Scanner leitor = new Scanner(System.in);
	        int a = leitor.nextInt();
	        int b = leitor.nextInt();
	        
	        if((a % b == 0) || (b % a == 0))
	        {
	            System.out.println("Sao Multiplos");
	        }
	        else
	        {
	            System.out.println("Nao sao Multiplos");
	        }
	    }
	}
