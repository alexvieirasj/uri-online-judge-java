package iniciante;

import java.util.Scanner;

/**
 * Soma de dois valores inteiros
 */
public class Exercise1001 {
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = x + y;
        System.out.println("X = "+soma);
    }    
}

