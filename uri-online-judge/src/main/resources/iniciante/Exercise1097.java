package iniciante;

/*
* Mostrar Sequencia IJ 3
*/

public class Exercise1097 {

	public static void main(String[] args) {
		
		int  j = 8, i = 1, save = 0;
		
		while(i <= 9) {
			
			save = j;
			for(int k = 1; k <= 3; k++) {
				System.out.println("I=" + i + " J=" + (j-=1));
			}
			
			j = save + 2;
	        i += 2; 
		}	

	}

}