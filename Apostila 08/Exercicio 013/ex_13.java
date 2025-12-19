import java.util.Scanner;

public class ex_13 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int[] P = new int[10], Q = new int[15], R = new int[P.length + Q.length];
		
		// Preenche P
		for (int i = 0; i < P.length; i++){
			P[i] = (int)(Math.random() * 1000);
		}
		
		// Preenche Q
		for (int i = 0; i < Q.length; i++){
			Q[i] = (int)(Math.random() * 10);
		}
		
		for (int i = 0; i < R.length; i++){
			if (i < P.length) {
				R[i] = P[i]; 
			} else {
				R[i] = Q[i - P.length]; 
			}
		}
		
		
		for (int i = 0; i < R.length; i++){
			System.out.print(R[i] + " ");
		}
	}
}

/* Feito por Lucas Soares Vieira */
