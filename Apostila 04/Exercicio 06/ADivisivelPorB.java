import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		
		/* Variaveis inicio */
		Scanner leia = new Scanner (System.in);
		int A_random = 0;
		int B_random = 0;
		
		System.out.println("Digite um numero de 0 a 1000");
		A_random = leia.nextInt();
		
		System.out.println("\n" + "Digite um numero de 0 a 20");
		B_random = leia.nextInt();
		/* Variaveis fim */
		
		if ( (A_random > 1000 | A_random < 0) | (B_random > 20 | B_random < 0) ) {
			System.out.println("\n" + "Digite um valor valido");
			} else if (A_random % B_random == 0) {
				int divisao = A_random / B_random;
				System.out.println("\n" + "A e divisivel por B, o resultado e" + divisao);
			} else {
				System.out.println("\n" + "A nao e divisivel por B");
				}
			
			
		if (A_random > B_random) {
			System.out.println("\n" + "A maior que B");
			}
		
		leia.close();
	}
}

