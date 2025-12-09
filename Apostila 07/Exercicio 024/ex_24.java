import java.util.Scanner;

public class ex_24 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String seq = " "; String cont = " "; int tamanho = 0;
		
		System.out.print("Digite uma sequencia de 0 e 1: ");
		seq = leia.nextLine().trim();
		
		for ( int i = 0; i < seq.length(); i++){
			if ( seq.charAt(i) == '1'){
				cont += '1';
				tamanho++;
				}
			
			}
			
			System.out.println("Maior sequencia de 1: " + cont + " Quantidade de 1: " + tamanho);
	}
}

/* Feito por Lucas Soares Vieira */
