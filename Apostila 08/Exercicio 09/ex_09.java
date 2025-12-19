import java.util.Scanner;

public class ex_09 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int[] numeros = new int[5]; int leitor = 0; int par = 0;
		
		for ( int i = 0; i < numeros.length; i++){
			System.out.printf("Digite um numero para a posicao %d: ", i + 1);
			leitor = leia.nextInt();
			numeros[i] = leitor;
			}
			
			for ( int n = 0; n != numeros.length; n++){
				
				if ( numeros[n] % 2 == 0){
					par += numeros[n];
					}
					
				}
				
				if ( par == 0){
					System.out.println("Fim do programa!");
					} else {
						System.out.println(par);
						}
	}
}

/* Feito por Lucas Soares Vieira */
