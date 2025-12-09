import java.util.Scanner;

public class ex_14 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra = " "; String novaFrase = " "; char letra = ' ';
		
		System.out.print("Digite uma palavra: ");
		palavra = leia.nextLine().toLowerCase();
		
		System.out.print("Digite um caractere: ");
		letra = leia.nextLine().charAt(0);
		
		for (int i = 0; i < palavra.length(); i++){
			
			novaFrase = palavra.replace(letra, '*');
		}
		
		System.out.print(novaFrase);
	}
}

/* Feito por Lucas Soares Vieira */
