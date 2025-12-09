import java.util.Scanner;

public class ex_23 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String frase = " ";
		
		System.out.print("Digite algo: ");
		frase = leia.nextLine().toLowerCase().trim();
		
		int ultimo_espaco = frase.lastIndexOf(' ');
		
		String sobrenome = frase.substring( ultimo_espaco + 1 );
		
		System.out.print("Sobrenome eh: " + sobrenome );
	}
}

/* Feito por Lucas Soares Vieira */
