import java.util.Scanner;

public class ex_07 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int[] numeros = new int[5]; 
		int maior = 0, menor = 0;
		
		for (int i = 0; i < numeros.length; i++){
			int leitor = 0;
			System.out.printf("Insira um numero na posicao %d: ", i + 1);
			leitor = leia.nextInt();
			numeros[i] = leitor;
			}
			
			for ( int n = 0; n < numeros.length; n++){
				if (n == 0){
					maior = numeros[n];
					menor = numeros[n];
					}
					
					if ( numeros[n] > maior ){
						maior = numeros[n];
						}
						
						if ( numeros[n] < menor ){
						menor = numeros[n];
						}
						
						if ( n == numeros.length - 1){
							System.out.printf("%nO menor eh: %d", menor);
							System.out.printf("%nO maior eh: %d", maior);
							}
				}
	}
}

/* Feito por Lucas Soares Vieira */
