import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		long precoProduto1 = 0;
		long precoProduto2 = 0;
		
		System.out.println("Digite o valor do produto 1");
		precoProduto1 = leia.nextLong();
		
		System.out.println("Digite o valor do produto 2");
		precoProduto2 = leia.nextLong();
		
		if (precoProduto1 > 1000 && precoProduto2 > 1000){
			System.out.println("VALOR INVALIDO");
			} else if ( precoProduto1 <= 1000 && precoProduto2 <= 1000){
				if (precoProduto1 < precoProduto2)
				 {
						System.out.println("O valor do produto 1 e menor que o produto 2");
					} else if (precoProduto2 < precoProduto1) {
						System.out.println("O valor do produto 2 e menor que o produto 1");
					} else if (precoProduto1 == precoProduto2) {
						System.out.println("Os valores sao identicos");
					}
			}
	}
}

