import java.util.Scanner;

public class ex_15 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra = " "; boolean numero = false;
		
		System.out.print("Digite algo: ");
		palavra = leia.nextLine().toLowerCase();
		
		for ( int i = 0; i < palavra.length(); i++){
			char letra = palavra.charAt(i);
			
			if ( letra >= '0' & letra <= '9'){
				numero = true;
				}
				
			}
			
		if (numero == true){
			System.out.println("Tem numero!");
			}
	}
}

/* Feito por Lucas Soares Vieira */
