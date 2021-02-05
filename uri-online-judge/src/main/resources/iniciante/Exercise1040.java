package iniciante;

import java.util.Scanner;
/*
* Calcular media de 4 notas
*/

public class Exercise1040 {

	 public static void main(String[] args) {
		 	Scanner leitor = new Scanner(System.in);
	        
	        float nota1 = leitor.nextFloat();
	        float nota2 = leitor.nextFloat();
	        float nota3 = leitor.nextFloat();
	        float nota4 = leitor.nextFloat();
	        
	        float media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) /10;
	        
	        if(media >= 7.0) {
	        	
	        	System.out.printf("Media: %.1f\n", media);
	        	System.out.print("Aluno aprovado.\n");
	        	
	        } else if(media < 5.0) {
	        	
	        	System.out.printf("Media: %.1f\n", media);
	        	System.out.print("Aluno reprovado.\n");
	        	
	        }  else if (media >= 5.0 && media <= 6.9) {
	        	
	        	System.out.printf("Media: %.1f\n",media);
				System.out.print("Aluno em exame.\n");
				
				float notaLeituraExame = leitor.nextFloat();
	  
	        	System.out.printf("Nota do exame: %.1f\n", notaLeituraExame);
	        	
	        	float notaFinal = (media + notaLeituraExame) / 2;
	        	
	        	 if(notaFinal >= 5.0) {
	        		 System.out.print("Aluno aprovado.\n");
	 	        } else {
	 	        	 System.out.print("Aluno reprovado.\n");
	 	        } 
	        	 
	        	System.out.printf("Media final: %.1f\n", notaFinal);
	        }

	        
	 }
}
