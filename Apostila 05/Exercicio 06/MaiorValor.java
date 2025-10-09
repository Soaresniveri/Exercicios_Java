import java.util.Scanner;

public class MaiorValor {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int valor_1; int valor_2; int valor_3;
		
		System.out.println("Digite o primeiro valor!");
		valor_1 = leia.nextInt();
		
		System.out.println("\n" + "Digite o segundo valor!");
		valor_2 = leia.nextInt();
		
		if (valor_1 == valor_2) {
			System.out.println("\n" + "Nao comparo valores iguais!");
			} else {
				
			valor_3 = Math.max(valor_1, valor_2);
			System.out.println("\n" + "O maior valor e " + valor_3);
			}
	}
}

