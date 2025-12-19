import java.util.Scanner;

public class ex_25 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int N = leia.nextInt();

        int[] AF = new int[N];

        // Leitura do vetor
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            AF[i] = leia.nextInt();
        }

        // Ordenação: ímpares crescente e pares decrescente
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {

                if (AF[i] % 2 != 0 && AF[j] % 2 != 0) {
                    if (AF[j] < AF[i]) {
                        int aux = AF[i];
                        AF[i] = AF[j];
                        AF[j] = aux;
                    }
                }

                // Ambos PARES → ORDEM DECRESCENTE
                if (AF[i] % 2 == 0 && AF[j] % 2 == 0) {
                    if (AF[j] > AF[i]) {
                        int aux = AF[i];
                        AF[i] = AF[j];
                        AF[j] = aux;
                    }
                }
            }
        }

        // Impressão
        System.out.println("\nVetor final (ímpares ↑ e pares ↓):");
        for (int i = 0; i < N; i++) {
            System.out.print(AF[i] + " ");
        }

        leia.close();
    }
}

/* Feito por Lucas Soares Vieira */
