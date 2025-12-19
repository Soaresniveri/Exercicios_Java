import java.util.Scanner;

public class ex_15 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int leitor = 0;
		
		System.out.print("Digite o tamanho do array S ( menor ou igual a 10): ");
		leitor = leia.nextInt();
		int[] S = new int [leitor];
		
		System.out.print("Digite o tamanho do array T ( menor ou igual a 15): ");
		leitor = leia.nextInt();
		int[] T = new int [leitor];
		
		int[] U = new int [ S.length + T.length];
		
		if ( S.length > 10 || T.length > 15){
			System.out.print("Fim do programa ");
			return;
			
			} else {
				// Verificacao feita
				for ( int i = 0; i < S.length; i++){
					int random = (int)(Math.random() * 1000);
					S[i] = random;
					}
				
				for ( int i = 0; i < T.length; i++){
					int random = (int)(Math.random() * 20);
					T[i] = random;
					}
					
					int indexT = 0;
					int indexS = 0;
					
					for (int i = 0; i < U.length; i++) {
							if (i % 2 == 0) { // posição par → S
								if (indexS < S.length) {
									U[i] = S[indexS++];
							} else { // S acabou → usa T
								U[i] = T[indexT++];
						}
					} else { // posição ímpar → T
						if (indexT < T.length) {
							U[i] = T[indexT++];
						} else { // T acabou → usa S
							U[i] = S[indexS++];
						}
					}
				}
				
				for ( int i = 0; i < U.length; i++){
					System.out.print(U[i] + " ");
					}
			}
		}
}


/* Feito por Lucas Soares Vieira */
