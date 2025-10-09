import java.util.Scanner;
public class Comissao {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		double salario = 2000; double valor_compra; double extra; double extra2;
		
		System.out.println("Coloque o valor da compra");
		valor_compra = leia.nextDouble();
		
		if (valor_compra > 1500.00) {
			extra = (1500 * 0.03) + ((valor_compra - 1500) * 0.05);
			
			System.out.printf("%n----------------------------------------%n"); 
			System.out.printf("Seu salario normal e: %.2f" + " com adicional de R$: %.2f", salario, extra);
			
			} else {
				extra = (valor_compra * 0.03);
				System.out.printf("%n----------------------------------------%n");
				System.out.printf("Seu salario normal e: %.2f" + " com adicional de R$:%.2f", salario, extra);
		}	
	}
}

