import java.util.Scanner;

public class ex_10 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int[] PA = new int[5], PB = new int [5], PC = new int [10];
		int leitor = 0; int x = 0;
		
		for (int i = 0; i < PA.length; i++){
			System.out.print("Digite um valor para PA: ");
			leitor = leia.nextInt();
			PA[i] = leitor;
			
			System.out.print("Digite um valor para PB: ");
			leitor = leia.nextInt();
			PB[i] = leitor;
			}
			
			for (int i = 0; i < PA.length; i++) {
				PC[x] = PA[i];
				x++;
			}
			for (int i = 0; i < PB.length; i++) {
				PC[x] = PB[i];
				x++;
			}
				
				for ( int z = 0; z < PC.length; z++){
					System.out.print(PC[z] + " ");
					}
	}
}

/* Feito por Lucas Soares Vieira */
