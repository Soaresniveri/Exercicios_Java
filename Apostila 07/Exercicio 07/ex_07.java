import java.util.Scanner;

public class ex_07 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String palavra = " "; 
		
		System.out.print("Digite algo: ");
		palavra = leia.nextLine().toLowerCase();
		
		for (int i = 'a'; i <= 'z'; i++){
			int cont = 0;
			
				for (int l = 0; l < palavra.length(); l++){
					if ( palavra.charAt(l) == i){
						cont++;
						}
					}
				
				if (cont > 0){
					System.out.println((char)i + " = " + cont);
					}
			}
	}
}

/* Feito por Lucas Soares */
