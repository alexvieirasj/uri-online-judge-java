package iniciante;
import java.util.Scanner;

/* Sequência S */

public class Exercise1155 {
	
	public static void main(String args[]) {
		
		double S = 1;
		
		for(double i=2; i<=100; i++){
		
			S = S + (1/i);
		}
		
        System.out.printf("%.2f\n", S);
	        
	  }
}
