import java.util.Scanner;

public class ex_09 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String palavra = " "; int cont = 0;
		
		System.out.print("Digite uma frase: ");
		palavra = leia.nextLine();
		
		for ( int i = 0; i < palavra.length(); i++){
			if ( palavra.charAt(i) == 32){
				cont++;
				}
			}
			
		System.out.println(cont);
	}
}

/* Feito por Lucas Soares Vieira */
