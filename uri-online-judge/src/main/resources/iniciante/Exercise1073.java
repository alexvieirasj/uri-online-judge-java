package iniciante;

import java.util.Scanner;

/*
* Calcular o quadrado dos números pares
*/

public class Exercise1073 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        int i, valor;

        for (i = 1; i <= N; i++)
        {
            if (i % 2 == 0)
            {
                
                valor = i * i;
                System.out.println(i+"^"+2+" = "+valor); 
            } 
            else if (i == N)
            {
                if (i % 2 == 0) 
                {
                    valor = i * i;
                    System.out.println(i+"^"+2+" = "+valor); 
                }
            }
        }

    }
}
