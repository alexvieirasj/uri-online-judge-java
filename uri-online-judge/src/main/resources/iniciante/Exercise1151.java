package iniciante;
import java.util.Scanner;

/* Fibonacci Fácil */

public class Exercise1151 {
	
	public static void main(String args[]) {
		
		Scanner leitor = new Scanner(System.in);
        int valor = leitor.nextInt();
        int resultado = 0, antes = 0, depois = 1, i;
        
        for(i=0; i<valor; i++)
        {
            if(i==0)
            {
                resultado= 0;
            }
            else if(i==1)
            {
                resultado= 1;
            }
            else
            {
                resultado = antes + depois;
                antes = depois;
                depois = resultado;
            }
            
            if(i == (valor - 1))
                System.out.printf("%d\n", resultado);
            else
                System.out.printf("%d ",resultado);
        }
    }
}