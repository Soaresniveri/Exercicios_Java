import java.util.Scanner;

public class Saudacao {
	
	public static void main (String[] args) {
		
		/* Variaveis inicio */
		Scanner leia = new Scanner ( System.in );
		int hora = 0;
		int sn = 0;
		int new_value = 0;
		
		System.out.println("Voce quer inserir as horas manualmente?" + "\n" + "Se sim, digite '1', caso contrario digite '2'");
		sn = leia.nextInt();
		/* Variaveis Fim */
		
		if (sn == 1) {
			System.out.println("Digite um valor entre 0 e 23");
			new_value = leia.nextInt();
			
			if (new_value <= -1 | new_value >= 24) {
				System.out.println("Valor invalido!");
			}else if (new_value >= 0 & new_value <= 6) {
				System.out.println("Zzz");
			} else if (new_value >= 7 & new_value <= 11) {
				System.out.println("Bom dia!");
			} else if (new_value >= 12 & new_value <= 17) {
				System.out.println("Boa Tarde!");
			} else if (new_value >= 18 & new_value <= 23) {
				System.out.println("Boa noite!");
			}
			
		} else if (sn == 2) {
			hora = ((int) (Math.random() * 24));
			if (hora >= 0 & hora <= 6) {
				System.out.println("Zzz");
			} else if (hora >= 7 & hora <= 11) {
				System.out.println("Bom dia!");
			} else if (hora >= 12 & hora <= 17) {
				System.out.println("Boa Tarde!");
			} else if (hora >= 18 & hora <= 23) {
				System.out.println("Boa noite!");
			}
			
		} else {
			System.out.println("\n" + "Digite uma resposta valida!");
		}
		leia.close();
	}
}

