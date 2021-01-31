package iniciante;

import java.util.Scanner;
/*
* Calcular notas e moedas
*/

public class Exercise1020 {

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

		    double valor = scan.nextDouble();		   
		    int restoDiv = (int) valor; 
		    double converterMoedas = valor - restoDiv;
		    int restoMoedas = (int) (converterMoedas * 100); 
		    int calculo = 0;
		    
		    System.out.println("NOTAS:");
		    
		    if( (restoDiv / 100) > 0) {	
		    	calculo = (restoDiv / 100);		    	
		    	restoDiv =  restoDiv - (calculo * 100);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println( calculo + " nota(s) de R$ 100.00");
		    
		    if( (restoDiv / 50) > 0) {
		    	calculo = (restoDiv / 50);		    	
		    	restoDiv =  restoDiv - (calculo * 50);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " nota(s) de R$ 50.00");
		    
		    if( (restoDiv / 20) > 0) {	
		    	calculo = (restoDiv / 20);		    	
		    	restoDiv =  restoDiv - (calculo * 20);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println( calculo + " nota(s) de R$ 20.00");
		    
		    if( (restoDiv / 10) > 0) {
		    	calculo = (restoDiv / 10);		    	
		    	restoDiv =  restoDiv - (calculo * 10);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " nota(s) de R$ 10.00");
		    
		    if( (restoDiv / 5) > 0) {
		    	calculo = (restoDiv / 5);		    	
		    	restoDiv =  restoDiv - (calculo * 5);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " nota(s) de R$ 5.00");
		    
		    if( (restoDiv / 2) > 0) {
		    	calculo = (restoDiv / 2);		    	
		    	restoDiv =  restoDiv - (calculo * 2);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " nota(s) de R$ 2.00");
		    

		    System.out.println("MOEDAS:");
		    
		    
		    if( (restoDiv / 1) > 0) {
		    	calculo = (restoDiv / 1);		    	
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " moeda(s) de R$ 1.00");
		    
		    
		    if( (restoMoedas / 50) > 0) {
		    	calculo = (restoMoedas / 50);		    	
		    	restoMoedas =  restoMoedas - (calculo * 50);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " moeda(s) de R$ 0.50");

		    
		    if( (restoMoedas / 25) > 0) {
		    	calculo = (restoMoedas / 25);		    	
		    	restoMoedas =  restoMoedas - (calculo * 25);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " moeda(s) de R$ 0.25");

		    
		    if( (restoMoedas / 10) > 0) {
		    	calculo = (restoMoedas / 10);		    	
		    	restoMoedas =  restoMoedas - (calculo * 10);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " moeda(s) de R$ 0.10");

		    
		    if( (restoMoedas / 5) > 0) {
		    	calculo = (restoMoedas / 5);		    	
		    	restoMoedas =  restoMoedas - (calculo * 5);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " moeda(s) de R$ 0.05");

		    
		    if( (restoMoedas / 1) > 0) {
		    	calculo = (restoMoedas / 1);		    	
		    	restoMoedas =  restoMoedas - (calculo * 1);
		    } else {
		    	calculo = 0;
		    }
		    System.out.println(calculo + " moeda(s) de R$ 0.01");
	  }
}
