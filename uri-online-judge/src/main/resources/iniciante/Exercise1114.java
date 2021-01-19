package iniciante;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Para cada leitura de senha incorreta informada,
escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o
algoritmo encerrado. Considere que a senha correta é o valor 2002. */

import java.util.Scanner;


public class Exercise1114 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int n;
        do{
            n = ler.nextInt();
           if(n != 2002){
               System.out.print("Senha Invalida\n");
           } else {
               System.out.print("Acesso Permitido\n");
               break;
           }
        }while(n != 2002);
        ler.close();
    }
}
