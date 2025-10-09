import java.util.Scanner;

public class CodigoProd {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double preco, valorFrete, precoFinal; int codigo; String procedencia;
        
        System.out.print("Digite o preço do produto: R$ ");
        preco = leia.nextDouble();
        
        System.out.print("Digite o código de origem: ");
        codigo = leia.nextInt();
        
        // Determinar região e frete
        if (codigo == 1) {
            procedencia = "Norte";
            valorFrete = preco * 0.10;
        } else if (codigo == 2 || codigo == 5 || codigo == 9) {
            procedencia = "Sul";
            valorFrete = preco * 0.03;
        } else if ((codigo >= 3 && codigo <= 15) && codigo != 7 && codigo != 10) {
            procedencia = "Leste";
            valorFrete = preco * 0.012; // 1,2%
        } else if (codigo == 7 || codigo == 20) {
            procedencia = "Oeste";
            valorFrete = preco * 0.073; // 7,3%
        } else if (codigo == 10) {
            procedencia = "Leste";
            valorFrete = preco * 0.012;
        } else {
            procedencia = "Importado";
            valorFrete = preco * 0.222; // 22,2%
        }
        
        precoFinal = preco + valorFrete;
        
        // Mostrar resultados
        System.out.println("\n----------------------------------------");
        System.out.printf("Preço do produto:      R$ %.2f%n", preco);
        System.out.printf("Procedência:           %s%n", procedencia);
        System.out.printf("Valor do frete:        R$ %.2f%n", valorFrete);
        System.out.printf("Preço final a pagar:   R$ %.2f%n", precoFinal);
        System.out.println("----------------------------------------");
        
        leia.close();
    }
}
