import java.util.Scanner;

public class ex_19 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra = " ";
		
		System.out.print("Digite um palavra: ");
		palavra = leia.nextLine().toLowerCase();
		
		for ( int i = 0; i < palavra.length(); i++ ){
			char letra1 = palavra.charAt(i);
			char letra2 = palavra.charAt(palavra.length() - 1 - i);
			
			if ( letra1 != letra2 ){
				System.out.println("Nao eh palindromo");
				break;
				} else {
					System.out.println("eh palindromo");
					break;
					}
			}
	}
}

/* Feito por Lucas Soares Vieira */
