import java.util.Scanner;

public class ex_18 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra = " ";
		
		System.out.print("Digite uma palavra: ");
		palavra = leia.nextLine();
		
		for ( int i = 0; i < palavra.length(); i++){
			if ( palavra.length() != 7){
				char letra = palavra.charAt(i);
				if ( letra != '0' && letra != '1'){
					System.out.print("nao e binario!");
					break;
					}
				}
			}
	}
}

/* Feito por Lucas Soares */
