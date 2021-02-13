package iniciante;

import java.util.Scanner;
/*
* Verificar o tipo do animal
*/

public class Exercise1049 {

	 public static void main(String[] args) {
		 	Scanner leitor = new Scanner(System.in);
	        
	        String grupo = leitor.nextLine();
	        String categoria = leitor.nextLine();
	        String alimento = leitor.nextLine();
	        
	        if(grupo.equalsIgnoreCase("vertebrado")) //ve se a string é igual e ignora letras maiusculas e minusculas 
	        {
	            
	            if(categoria.equalsIgnoreCase("ave"))
	            { 
	               if(alimento.equalsIgnoreCase("carnivoro"))
	               {
	                   System.out.println("aguia");
	               }
	               else if(alimento.equalsIgnoreCase("onivoro"))
	               {
	                   System.out.println("pomba");
	               }
	            }
	            else if(categoria.equalsIgnoreCase("mamifero"))
	            {  
	               if(alimento.equalsIgnoreCase("onivoro"))
	               {
	                   System.out.println("homem");
	               }
	               else if(alimento.equalsIgnoreCase("herbivoro"))
	               {
	                   System.out.println("vaca");
	               }
	            }
	        }
	        else if(grupo.equalsIgnoreCase("invertebrado"))
	        {
	            
	            
	            if(categoria.equalsIgnoreCase("inseto"))
	            {
	               if(alimento.equalsIgnoreCase("hematofago"))
	               {
	                   System.out.println("pulga");
	               }
	               else if(alimento.equalsIgnoreCase("herbivoro"))
	               {
	                   System.out.println("lagarta");
	               }
	            }
	            else if(categoria.equalsIgnoreCase("anelideo"))
	            {
	               if(alimento.equalsIgnoreCase("hematofago"))
	               {
	                   System.out.println("sanguessuga");
	               }
	               else if(alimento.equalsIgnoreCase("onivoro"))
	               {
	                   System.out.println("minhoca");
	               }
	            }
	        }  
	 }
}
