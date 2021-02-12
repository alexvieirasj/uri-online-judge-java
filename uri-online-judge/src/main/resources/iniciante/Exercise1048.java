package iniciante;

import java.util.Scanner;
import java.util.Arrays;
/*
* Calcular aumento de sálario
*/

public class Exercise1048 {

	 public static void main(String[] args) {
		 	Scanner leitor = new Scanner(System.in);

	        float valor = leitor.nextFloat();
	        int percentual = 0;
	        float reajuste = 0;
	        float novoSalario = 0;
	        
	        if(valor >= 0 && valor <= 400.00) {
	        	percentual = 15;
	        } else if(valor >= 400.01 && valor <= 800.00) {
	        	percentual = 12;
	        } else if(valor >= 800.01 && valor <= 1200.00) {
	        	percentual = 10;
	        } else if(valor >= 1200.01 && valor <= 2000.00) {
	        	percentual = 7;
	        } else if(valor > 2000.00) {
	        	percentual = 4;
	        }
	        
	        reajuste = (valor * percentual) / 100; 
        	novoSalario = valor + reajuste;	 
        	
        	System.out.printf("Novo salario: %.2f\n",novoSalario);
        	System.out.printf("Reajuste ganho: %.2f\n",reajuste);
        	System.out.println("Em percentual: " + percentual + " %");
	    }
	}
