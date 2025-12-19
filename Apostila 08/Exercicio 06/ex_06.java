import java.util.Scanner;

public class ex_06 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		
		for ( int i = 0; i < a.length; i++){
			int leitor = 0;
			int x = i + 1;
			
			System.out.printf("Digite o valor para entrar no vetor A, posicao %d: ", x);
			leitor = leia.nextInt();
			a[i] = leitor;
			
			System.out.printf("Digite o valor para entrar no vetor B, posicao %d: ", x);
			leitor = leia.nextInt();
			b[i] = leitor;
			}
			
			for ( int n = 0; n < a.length; n++){
				for ( int z = 0; z < a.length; z++){
					if ( a[n] == b[z]){
						System.out.printf("%nO valor de A(%d) na posicao %d eh igual ao valor de B(%d) na posicao %d", a[n], n + 1, b[z], z + 1);
						}
					}
				}
	}
}

/* Feito por Lucas Soares Vieira */
