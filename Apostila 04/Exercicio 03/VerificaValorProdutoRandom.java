import java.util.Scanner;

public class VerificaValorProdutoRandom{
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double precoProduto1 = Math.random() * 1000;
		double precoProduto2 = Math.random() * 1000;
		
		if (precoProduto1 < precoProduto2) {
			System.out.println( "O produto 1 e menor que o 2");
			} else {
			System.out.println( "O produto 2 e menor que o 1");
			}
	}
}

