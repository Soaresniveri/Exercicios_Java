import java.util.Scanner;

public class Macas_compra {
	
	public static void main (String[] args) {
		
		/* Variaveis inicio */
		Scanner leia = new Scanner(System.in);
		int macas = 0;
		double valor_macas_menor_que_duzia = 1.30;
		double valor_macas_maior_que_duzia = 1.00;
		/* Variaveis fim */
		
		System.out.println("Digite a quantidade de macas que voce comprara ");
		macas = leia.nextInt();
		
		if (macas <= 12) {
			double novo_valor1 = macas * valor_macas_menor_que_duzia;
			System.out.printf("O valor e de R$ %.2f%n", novo_valor1);
		} else {
			double novo_valor2 = macas * valor_macas_maior_que_duzia;
				System.out.printf("O valor e de R$ %.2f%n", novo_valor2);
			}
	}
}

