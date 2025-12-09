import java.util.Scanner;

public class ex_08 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String palavra = " ";
		
		System.out.print("Digite algo: ");
		palavra = leia.nextLine().toLowerCase();
		
		for (int l = 'a'; l <= 'z'; l++){
			int cont = 0;
			
			for (int i = 0; i < palavra.length(); i++){
				
				if ( palavra.charAt(i) == l ){
					cont++;
					}
				}
				
				if (cont != 0){
					System.out.println( (char)l + " = " + cont);
					}
			}
		
	}
}

/* Feito por Lucas Soares Vieira */
