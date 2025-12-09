import java.util.Scanner;

public class ex_05 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String palavra = ""; int cont = 0;
		
		System.out.print("Digite algo: ");
		palavra = leia.nextLine();
		
		palavra = palavra.toLowerCase();
		
		for (int i = 0; i < palavra.length(); i++){
			
			if ( palavra.charAt(i) == 'a'){
				cont++;
				}
			}
			
		System.out.print(cont);
	}
}

/* Feito por Lucas Soares Vieira */
