import java.util.Scanner;

public class Prova_media {
	
	public static void main (String[] args) {
		
		/* variaveis inicio */
		Scanner leia = new Scanner (System.in);
		int prova1; int prova2; double media;
		
		System.out.println("Digite a nota da primeira prova ");
		prova1 = leia.nextInt();
		
		System.out.println("\n" + "Digite a nota da segunda prova ");
		prova2 = leia.nextInt();
		
		media = ((double) ((prova1 + prova2) / 2));
		
		if (media < 6) {
			System.out.printf("O aluno reprovou, sua nota foi: %.2f%n", media );
			} else {
			System.out.printf("O aluno esta aprovado, sua nota foi: %.2f%n", media );
			}
	}
}

