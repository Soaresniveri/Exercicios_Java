import java.util.Scanner;

public class ex_19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] Z = new int[10];

        // Leitura do vetor
        for (int i = 0; i < Z.length; i++) {
            System.out.print("Digite um número: ");
            Z[i] = leia.nextInt();
        }

        // Ordenação simples (bolha)
        for (int i = 0; i < Z.length; i++) {
            for (int j = i + 1; j < Z.length; j++) {
                if (Z[j] < Z[i]) {
                    int aux = Z[i];
                    Z[i] = Z[j];
                    Z[j] = aux;
                }
            }
        }

        // Impressão do vetor ordenado
        System.out.println("\nVetor ordenado:");
        for (int i = 0; i < Z.length; i++) {
            System.out.print(Z[i] + " ");
        }
    }
}

/* Feito por Lucas Soares Vieira */
