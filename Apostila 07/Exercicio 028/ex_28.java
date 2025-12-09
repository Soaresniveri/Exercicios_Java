import java.util.Scanner;

public class ex_28 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra = " ";
		
		System.out.print("Digite algo: ");
		palavra = leia.nextLine().trim();
		
		for ( int i = 0; i < palavra.length(); i++){
			char letra_1 = palavra.charAt(i);
			char letra_2 = palavra.charAt( palavra.length() - 1 - i);
			
			String letra_1_str =(Character.toString(letra_1));
			String letra_2_str =(Character.toString(letra_2));
			
			System.out.print( letra_1 + "" + letra_2 );
			}
		
	}
}

/* Feito por Lucas Soares */
