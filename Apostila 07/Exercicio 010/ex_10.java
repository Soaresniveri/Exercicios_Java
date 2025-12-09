import java.util.Scanner;

public class ex_10 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String palavra = " "; 
		
		System.out.print("Digite uma frase: ");
		palavra = leia.nextLine();
		
		for (int i = 'A'; i <= 'Z'; i++){
			int cont = 0;
			
			for (int l = 0; l < palavra.length(); l++){
				if ( palavra.charAt(l) == i){
					cont++;
					}
				}
				
				if (cont != 0) {
				System.out.println((char)i + " = " + cont);
				}
		}
	}
}

/* Feito por Lucas Soares Vieira */
