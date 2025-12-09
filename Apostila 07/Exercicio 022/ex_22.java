import java.util.Scanner;

public class ex_22 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra = " "; String frase = " "; int cont = 0;
		
		System.out.print("Digite algo: ");
		frase = leia.nextLine().toLowerCase();
		
		System.out.print("Digite uma palavra para comparar: ");
		palavra = leia.nextLine().toLowerCase();
		
		for (int i = 0; i <= frase.length() - palavra.length(); i++) {
			if (frase.substring(i, i + palavra.length()).equals(palavra)) {
			cont++;
			}
		}
		
		System.out.println("A palavra ocorre " + cont + " vezes.");

	}
}

/* Feito por Lucas Soares Vieira */
