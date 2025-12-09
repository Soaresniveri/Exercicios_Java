import java.util.Scanner;

public class ex_27 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String palavra1 = " ", palavra2 = " "; String novaFrase = "";
		
		System.out.print("Digite a primeira frase: ");
		palavra1 = leia.nextLine().trim().toLowerCase();
		
		System.out.print("Digite a segunda frase: ");
		palavra2 = leia.nextLine().trim().toLowerCase();
		
		if ( palavra1.length() == palavra2.length() ){
			
			for (int i = 0; i < palavra1.length(); i++){
			char letra1 = palavra1.charAt(i), letra2 = palavra2.charAt(i);
			novaFrase += letra1;
			novaFrase += letra2;
			
		}
			} else {
				System.out.println("invalido! tamanhos diferentes! ");
				}
				System.out.println(novaFrase);
			
	}
}

/* Feito por Lucas Soares Vieira */
