import java.util.Scanner;

public class ex_16 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra = " "; boolean maiusculo = false;
		
		System.out.print("Digite uma palavra: ");
		palavra = leia.nextLine();
		
		for (int i = 0; i < palavra.length(); i++){
			char letra = palavra.charAt(0);
			
			if ( letra >= 'a' && letra <= 'z'){
				System.out.print("tem minusculas!");
					break;
					} else {
						System.out.print("TUDO MAIUSCULO!");
						break;
						}
				
			}
	}
}

/* Feito por Lucas Soares Vieira */
