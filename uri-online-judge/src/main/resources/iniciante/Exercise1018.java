package iniciante;

import java.util.Scanner;
/*
* Calcular cédulas
*/

public class Exercise1018 {

	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);

		    int valor = scan.nextInt();		   
		    int restoDiv = valor; 
		    int calculo = 0;
		    
		    System.out.println(valor);
		    
		    if( (restoDiv / 100) > 0) {	
		    	calculo = (restoDiv / 100);		    	
		    	restoDiv =  restoDiv - (calculo * 100);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println( calculo + " nota(s) de R$ 100,00");
		    
		    if( (restoDiv / 50) > 0) {
		    	calculo = (restoDiv / 50);		    	
		    	restoDiv =  restoDiv - (calculo * 50);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " nota(s) de R$ 50,00");
		    
		    if( (restoDiv / 20) > 0) {	
		    	calculo = (restoDiv / 20);		    	
		    	restoDiv =  restoDiv - (calculo * 20);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println( calculo + " nota(s) de R$ 20,00");
		    
		    if( (restoDiv / 10) > 0) {
		    	calculo = (restoDiv / 10);		    	
		    	restoDiv =  restoDiv - (calculo * 10);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " nota(s) de R$ 10,00");
		    
		    if( (restoDiv / 5) > 0) {
		    	calculo = (restoDiv / 5);		    	
		    	restoDiv =  restoDiv - (calculo * 5);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " nota(s) de R$ 5,00");
		    
		    if( (restoDiv / 2) > 0) {
		    	calculo = (restoDiv / 2);		    	
		    	restoDiv =  restoDiv - (calculo * 2);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " nota(s) de R$ 2,00");
		    
		    if( (restoDiv / 1) > 0) {
		    	calculo = (restoDiv / 1);		    	
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " nota(s) de R$ 1,00");	       
	  }
}
