package strings;

import java.util.Scanner;

/**
 * Substituir textos por underline e asteriscos por tag HTML
 * 
 */
public class Exercise1239 {
	
    public static void main(String[] args){
    	Scanner leitor= new Scanner(System.in);
        
        int contA= 0;
        int contB= 0;
        while(leitor.hasNext())
        {
            String letras= leitor.nextLine();
            for(int i=0; i<letras.length(); i++)
            {
                char c= letras.charAt(i);

                    if(c=='_')
                    {
                        contA++;
                        if(contA%2==1)
                            letras= letras.replaceFirst("_","<i>");
                        else
                            letras= letras.replaceFirst("_","</i>");
                    }
                    if(c=='*')
                    {                    
                        contB++;
                        if(contB%2==1)
                            letras= letras.replaceFirst("\\*", "<b>");
                        else
                            letras= letras.replaceFirst("\\*", "</b>");
                    }
            }
            if(contA%2==1 || contB%2==1)
                System.out.println("Número de '*' ou '_' inválidos");
            else
                System.out.println(letras);
        }
        
    }
}
