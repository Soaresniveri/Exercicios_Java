import java.util.Scanner;

public class ex_23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int N = leia.nextInt();

        int[] AD = new int[N];

        // Leitura do vetor
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            AD[i] = leia.nextInt();
        }

        // Ordenar somente os pares (crescente)
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (AD[i] % 2 == 0 && AD[j] % 2 == 0) {
                    if (AD[j] < AD[i]) {
                        int aux = AD[i];
                        AD[i] = AD[j];
                        AD[j] = aux;
                    }
                }
            }
        }

        // Imprimir resultado
        System.out.println("\nVetor final (pares em ordem crescente):");
        for (int i = 0; i < N; i++) {
            System.out.print(AD[i] + " ");
        }

        leia.close();
    }
}

/* Feito por Lucas Soares Vieira */
