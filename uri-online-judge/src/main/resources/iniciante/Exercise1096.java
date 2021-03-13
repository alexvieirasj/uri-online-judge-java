package iniciante;

/*
* Mostrar Sequencia IJ 2
*/

public class Exercise1096 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 9) {
			
			int j = 8;
			for(int k = 1; k <= 3; k++) {
				System.out.println("I=" + i + " J=" + (j-=1));
			}
			
	        i += 2; 
		}	

	}

}