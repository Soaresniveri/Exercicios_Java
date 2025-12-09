import java.util.Scanner;

public class ex_21 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra = " ";
		
		System.out.print("Digite algo: ");
		palavra = leia.nextLine().toLowerCase();
		
		for (int i = 0; i < palavra.length(); i++){
			char letra = palavra.charAt(i);
			
			if ( letra == ' '){
				System.out.println();
				} else {
					System.out.print(letra);
					}
			}
	}
}

/* Feito por Lucas Soares Vieira */
