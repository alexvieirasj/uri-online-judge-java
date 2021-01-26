package iniciante;

import java.util.Scanner;

/*
* Calcular áreas de figuras geométricas
*/

public class Exercise1012 {

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	      
		 double a = scan.nextDouble();
		 double b = scan.nextDouble();
		 double c = scan.nextDouble();
		 
		 double triangulo =  (a * c) / 2;
		 double circulo   =  Math.pow(c, 2) * 3.14159;
		 double trapezio  =  ((a + b) / 2) * c;
		 double quadrado  =  Math.pow(b, 2);
		 double retangulo =  a * b;
		 
		 System.out.printf("TRIANGULO: %.3f\n", triangulo);
		 System.out.printf("CIRCULO: %.3f\n", circulo);
		 System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		 System.out.printf("QUADRADO: %.3f\n", quadrado);
		 System.out.printf("RETANGULO: %.3f\n", retangulo);
	  }
}
