import java.util.Scanner;

public class CalculadoraPobre {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in); double valor1; double valor2; double result; String operador;
		
		System.out.printf("Digite o primeiro valor %n");
		valor1 = leia.nextDouble();
		System.out.printf("----------------- %n");
		
		System.out.printf("Digite o segundo valor %n");
		valor2 = leia.nextDouble();
		System.out.printf("----------------- %n");
		
		System.out.printf("Coloque a operacao matematica a ser realizada sendo, +, -, * ou / %n");
		operador = leia.next();
		
		switch (operador) {
			case "+":
			result = valor1 + valor2;
			System.out.printf("O resultado da soma e: %d", result);
			break;
			
			case "-":
			result = valor1 - valor2;
			System.out.printf("O resultado da subtracao e: %d", result);
			break;
			
			case "*":
			result = valor1 * valor2;
			System.out.printf("O resultado da multiplicacao e: %d", result);
			break;
			
			case "/":
				if (valor2 != 0) {
					result = valor1 / valor2;
					System.out.printf("O resultado da divisao e: %.2f%n", result);
				} else {
					System.out.println("Erro: divisao por zero!");
				}
				break;
				
			default:
				System.out.println("Operaçao invalida!");
				break;
			}
	}
}

