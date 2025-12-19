import java.util.Scanner;

public class ex_03 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.printf("%nDigite a quantidade de valores: ");
		int tamanho = leia.nextInt();
		
		if ( tamanho > 20){
			System.out.printf("%nValor invalido!");
			} else {
				int[] numeros = new int[tamanho];
				for ( int i = 0; i < numeros.length; i++){
				int x = i + 1;
				System.out.printf("%nDigite um valor pra entrar na posicao " + x + " : ");
				
				numeros[i] = leia.nextInt();
				
				if ( i == numeros.length - 1){
					for ( int n = 0; n < numeros.length; n++){
					System.out.printf( numeros[n] + " ");
					}
				}
			}
		}
	}
}

/* Feito por Lucas Soares Vieira */
