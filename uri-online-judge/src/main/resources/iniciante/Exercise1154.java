package iniciante;
import java.util.Scanner;

/* Idades */

public class Exercise1154 {
	
	public static void main(String args[]) {
		
		Scanner leitor = new Scanner(System.in);
        
        float media=0, resultado=0;
        int cont=0, teste=0, idade;
        
        while(teste!=1)
        {
            idade = leitor.nextInt();
            
            if(idade>=0)
            {
               cont++;
               media += idade; 
            }
            else
            {
                teste=1;
            } 
        }
        resultado = media/cont;
        System.out.printf("%.2f\n",resultado);
        
    }
}