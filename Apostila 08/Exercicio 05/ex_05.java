import java.util.Scanner;

public class ex_05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int[] a = new int[15];
		int[] b = new int[15];
		int[] c = new int[15];
		
		for ( int i = 0; i < a.length; i++){
			int leitor = 0;
			int x = i + 1;
			
			System.out.printf("Digite o valor para entrar no vetor A, posicao %d: ", x);
			leitor = leia.nextInt();
			a[i] = leitor;
			
			System.out.printf("Digite o valor para entrar no vetor B, posicao %d: ", x);
			leitor = leia.nextInt();
			b[i] = leitor;
			
			c[i] = a[i] + b[i];
			
				if ( i == c.length - 1){
					for ( int n = 0; n < c.length; n++){
						int y = n + 1;
						System.out.printf("%nVetor C de posicao %d: %d", y, c[n] );
						}
					}
			}
	}
}

/* Feito por Lucas Soares Vieira */
