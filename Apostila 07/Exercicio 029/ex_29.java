import java.util.Scanner;

public class ex_29 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra = " "; int leitor = 0;
		
		while ( leitor != 3 ){
		System.out.printf("%n1) Criptografar%n2) Descriptografar%n3) Sair:%n Digite: ");
		leitor = leia.nextInt();
		leia.nextLine();
		
		if ( leitor == 1){
			System.out.printf("%nDigite a frase que sera criptografada: ");
			palavra = leia.nextLine().trim().toLowerCase();
			
			for (int i = 0; i < palavra.length(); i++){
			 char letra = palavra.charAt(i);
			 
			if (letra == 'z') letra = 'p';
				else if (letra == 'p') letra = 'z';
				else if (letra == 'e') letra = 'o';
				else if (letra == 'o') letra = 'e';
				else if (letra == 'n') letra = 'l';
				else if (letra == 'l') letra = 'n';
				else if (letra == 'i') letra = 'a';
				else if (letra == 'a') letra = 'i';
				else if (letra == 't') letra = 'r';
				else if (letra == 'r') letra = 't';
			System.out.print(letra);
			}
			
			} else if (leitor == 2) {
			System.out.printf("%nDigite a frase que sera descriptografada: ");
			palavra = leia.nextLine().trim().toLowerCase();
			
			for (int i = 0; i < palavra.length(); i++){
			 char letra = palavra.charAt(i);
			 
			if (letra == 'z') letra = 'p';
				else if (letra == 'p') letra = 'z';
				else if (letra == 'e') letra = 'o';
				else if (letra == 'o') letra = 'e';
				else if (letra == 'n') letra = 'l';
				else if (letra == 'l') letra = 'n';
				else if (letra == 'i') letra = 'a';
				else if (letra == 'a') letra = 'i';
				else if (letra == 't') letra = 'r';
				else if (letra == 'r') letra = 't';
			System.out.print(letra);
				
				}
			}
		}
	}
}

/* Feito por Lucas Soares Vieira */
