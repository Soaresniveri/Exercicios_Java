import java.util.Scanner;

public class ex_06 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String palavra = " "; char letra = ' '; int cont = 0;
		
		System.out.print("Digite uma letra: ");
		letra = leia.nextLine().charAt(0); // Importante de lembrar!
		
		System.out.print("Digite uma frase: ");
		palavra = leia.nextLine();
		
		palavra = palavra.toLowerCase();
		letra = Character.toLowerCase(letra);
		
		for (int i = 0; i < palavra.length(); i++){
			
			if ( palavra.charAt(i) == letra ){
				cont++;
				}
			}
		
		System.out.print(cont);
	}
}

/* Feito por Lucas Soares Vieira */
