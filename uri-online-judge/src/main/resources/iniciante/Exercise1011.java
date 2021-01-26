package iniciante;

import java.util.Scanner;

/*
* Calcular esfera (volume)
*/

public class Exercise1011 {

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	      
		 double pi = 3.14159;
		 double raio = scan.nextDouble();
        
		 double volume =  (4/3.0) * pi * Math.pow(raio, 3) ;
        
         System.out.printf("VOLUME = %.3f\n", volume);	        
	  }
}
