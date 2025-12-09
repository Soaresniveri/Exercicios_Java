import java.util.Scanner;

public class ex_17 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra1 = " "; String palavra2 = " ";
		boolean igual = true;
		
		System.out.print("Digite a primeira frase: ");
			palavra1 = leia.nextLine();
		
		System.out.print("Digite a segunda frase: ");
			palavra2 = leia.nextLine();
		
		if (palavra1.length() != palavra2.length() ){
			igual = false;
			} else {
				for ( int i = 0; i < palavra1.length(); i++){
					if ( palavra1.charAt(i) != palavra2.charAt(i) ){
						igual = false;
						break;
						}
					}
				}
				
			if ( igual ) {
				System.out.print("As frases sao iguais");
				} else {
					System.out.print("As frases sao diferentes");
					}
	}
}

/* Feito por Lucas Soares Vieira */
