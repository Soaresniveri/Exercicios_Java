import java.util.Scanner;

public class Votacao {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int ano_nasc; int ano_atual; int idade;
		
		System.out.println("Qual seu ano de nascimento?");
		ano_nasc = leia.nextInt();
		
		System.out.println("\n" + "Qual o ano atual?");
		ano_atual = leia.nextInt();
		
		idade = ( ano_atual - ano_nasc);
		
		if (idade > 18) {
			System.out.println("\n" + "Pode votar!");
			} else {
			System.out.println("\n" + "Nao pode votar!");
			}
		leia.close();
	}
}

