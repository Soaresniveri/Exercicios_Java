import java.util.Scanner;

public class ex_24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int N = leia.nextInt();

        int[] AE = new int[N];

        // Leitura do vetor
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            AE[i] = leia.nextInt();
        }

        // Ordenar somente ímpares (decrescente)
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // Só mexe se ambos forem ímpares
                if (AE[i] % 2 != 0 && AE[j] % 2 != 0) {
                    if (AE[j] > AE[i]) {  // decrescente
                        int aux = AE[i];
                        AE[i] = AE[j];
                        AE[j] = aux;
                    }
                }
            }
        }

        // Imprimir o resultado
        System.out.println("\nVetor final (ímpares em ordem decrescente):");
        for (int i = 0; i < N; i++) {
            System.out.print(AE[i] + " ");
        }

        leia.close();
    }
}

/* Feito por Lucas Soares Vieira */
