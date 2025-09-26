import java.util.Scanner;

public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		
		double nota = Math.random() * 10;
		
		if (nota >= 6) {
			System.out.println("APROVADO FI " + nota );
			} else {
			System.out.println("REPROVADO MAN " + nota);
			}
		
	}
}

/* Feito por Lucas Soares */
