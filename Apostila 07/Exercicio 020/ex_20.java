import java.util.Scanner;

public class ex_20 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra = ""; int cont = 1;
		
		System.out.print("Digite algo: ");
		palavra = leia.nextLine().trim();
		
		for ( int i = 0; i < palavra.length(); i++ ){
			if ( palavra.charAt(i) == ' '){
				cont++;
				}
			}
			
		System.out.print("quantidade de palavras: " + cont);
	}
}

/* Feito por Lucas Soares Vieira */
