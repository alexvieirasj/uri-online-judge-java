package strings;

import java.util.Scanner;

/**
 * Implemente um programa denominado combinador, que recebe duas strings e deve combiná-las, alternando as letras de cada string, 
 * começando com a primeira letra da primeira string, seguido pela primeira letra da segunda string, em seguida pela segunda letra da 
 * primeira string, e assim sucessivamente. As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string 
 * resultante e retornada.
 * 
 */
public class Exercise1238 {
	
    public static void main(String[] args){
    	Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        leitor.nextLine();//tem que ler a quebrar a linha para ler a de baixo
        int i, j, k, l, par, impar,f;
        String res[] = new String[N];
        
        for (l=0; l<N; l++ ) {
            String frase = leitor.nextLine();
            frase = frase.trim(); //retira os espaços antes e depois do texto
            String aux = "";
            String aux2 = "";
            String aux3 = "";              
            
            f=0;
            par=0;
            impar=0;
            for (i = 0; i < frase.length(); i++) {
                
                if (frase.charAt(i) == ' ' && frase.charAt(i + 1) != ' ') {
                        
                        par += i-1;
                        impar += i+1;       
                }
                f++;
            }
            f-=1;
            j=0;
            k=0;
            
           while(k<=par) {
                aux += frase.charAt(k); 
                aux3 += aux.charAt(k);
                k++;
                for (i = impar; i <= f; i++)
                { 
                    aux2 += frase.charAt(i);
                    aux3 += aux2.charAt(j);
                    j++;
                    impar++;
                    if(k<=par)
                    i = f+1; 
                }
               res[l] = aux3;
            }
        }
        for(int h=0; h<N; h++)
        {
           System.out.print(res[h]+"\n");
        }
            
      
    }
}
