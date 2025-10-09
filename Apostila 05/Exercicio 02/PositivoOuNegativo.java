import java.util.Scanner;

public class PositivoOuNegativo {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int valor = 0;
		
		System.out.println("Digite um valor" + "\n");
		valor = leia.nextInt();
		
		if (valor >= 0) {
			System.out.println("O valor e positivo " + valor);
			} else {
			System.out.println("O valor e negativo " + valor);
			}
	}
}

