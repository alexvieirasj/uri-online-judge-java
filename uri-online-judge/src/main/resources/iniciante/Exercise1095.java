package iniciante;

/*
* Mostrar Sequencia IJ 1
*/

public class Exercise1095 {

	public static void main(String[] args) {
		
		int j = 60, i = 1;
		
		while(j >= 0) {
			System.out.println("I=" + i + " J=" + j);
	        i += 3; 
			j -=5;
		}	
	}

}