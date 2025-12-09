import java.util.Scanner;

public class ex_11 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String palavra = " ";
		
		System.out.print("Digite algo: ");
		palavra = leia.nextLine().toLowerCase();
		int letras = 0;
		int numeros = 0;
		
		for (int l = 0; l < palavra.length(); l++){
			char letra = palavra.charAt(l);
			
			if ( letra >= 'a' && letra <= 'z'){
				letras++;
				}
			
			if ( letra >= '0' && letra <= '9'){
				numeros++;
				}
		}
		
		System.out.println("letras: " + letras);
		System.out.println("numeros: " + numeros);
	}
}

/* Feito por Lucas Soares */
