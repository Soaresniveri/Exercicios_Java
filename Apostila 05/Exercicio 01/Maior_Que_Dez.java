import java.util.Scanner;

public class Maior_Que_Dez {
	
	public static void main (String[] args) {
		
		int valor_random = (int) ( Math.random() * 20 );
		
		if (valor_random <= 10) {
			System.out.println("O valor e menor que dez " + valor_random);
			} else if (valor_random >= 10){
			System.out.println("O valor e maior que dez " + valor_random);
			}
	}
}

/* Feito por Lucas Soares */
