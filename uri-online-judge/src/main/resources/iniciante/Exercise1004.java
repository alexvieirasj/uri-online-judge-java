package iniciante;

import java.util.Scanner;

/*
* Fazer a produto de A e B 
*/

public class Exercise1004 {

	 public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);
	        
	        int a = leitor.nextInt();
	        int b = leitor.nextInt();
	        
	        int produto = a * b;
	        
	        System.out.println("PROD = " + produto);
	        
	    }
}
