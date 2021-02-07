package iniciante;

import java.util.Scanner;
/*
* Ordenar números em ordem crescente
*/

public class Exercise1042 {

	 public static void main(String[] args) {
		 	Scanner leitor = new Scanner(System.in);
	        
	        int num1 = leitor.nextInt();
	        int num2 = leitor.nextInt();
	        int num3 = leitor.nextInt();
	        int[] vet = {num1, num2, num3};
	        
	        int maior, menor, meio,i=0, j=0;
	        
	       maior =  Math.max(num1, num2);
	       int maiorF= Math.max(maior, num3);
	       
	       menor =  Math.min(num1, num2);
	       int menorF= Math.min(menor, num3);
	       
	       System.out.println(menorF);
	       
	        if(num1 != maiorF && num1 != menorF)
	        {
	            meio = num1;
	            System.out.println(meio);
	        }
	        else if(num2 != maiorF && num2 != menorF)
	        {
	            meio = num2;
	            System.out.println(meio);
	        }
	        else if(num3 != maiorF && num3 != menorF)
	        {
	            meio = num3;
	            System.out.println(meio);
	        } 
	        else{
	            while(i!=1){
	            
	            if(vet[j] == maiorF)
	            {
	                meio = maiorF;
	                System.out.println(meio);
	                i=1;
	                break;
	            }
	            else if(vet[j] == menorF)
	            {
	                meio = menorF;
	                System.out.println(meio);
	                i=1;
	                break;
	            }
	            j++;
	        }
	        }
	        System.out.println(maiorF);
	        
	        System.out.print("\n");
	        
	        System.out.println(num1);
	        System.out.println(num2);
	        System.out.println(num3); 
	    }
	}
