import java.util.Scanner;

public class ex_13 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra = " "; int cont = 0;
		
		System.out.print("Digite algo: ");
		palavra = leia.nextLine().toLowerCase();
		
		for ( int i = 0; i < palavra.length(); i++){
			char letra = palavra.charAt(i);
			
			if (letra != 'a' & letra != 'e' & letra != 'i' & letra != 'o' & letra != 'u'){
				cont++;
				}
			}
			
			System.out.print("quantidade de consoantes: " + cont);
	}
}

/* Feito por Lucas Soares Vieira */
