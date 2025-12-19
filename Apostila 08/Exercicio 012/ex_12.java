import java.util.Scanner;

public class ex_12 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int [] P = new int[10], Q = new int[15], R = new int[25];
		int leitor = 0; int x = 0;
		
		for ( int i = 0; i < P.length; i++){
			System.out.print("Insira o valor de P: ");
			leitor = leia.nextInt();
			P[i] = leitor;
			}
			
		for ( int i = 0; i < Q.length; i++){
			System.out.print("Insira o valor de Q:");
			leitor = leia.nextInt();
			Q[i] = leitor;
			}
			
			
			for (int i = 0; i < P.length; i++){
				R[x] = P[i];
				x++;
			}
			
			for (int i = 0; i < Q.length; i++){
				R[x] = Q[i];
				x++;
			}
			
			// Imprime R
			System.out.print("\nVetor R: ");
			for (int i = 0; i < R.length; i++){
				System.out.print(R[i] + " ");
			}
	}
}

/* Feito por Lucas Soares Vieira */
