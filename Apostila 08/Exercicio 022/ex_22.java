import java.util.Scanner;

public class ex_22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N = 0;

        // ---- Validação de N ----
        do {
            System.out.print("Digite a quantidade de posições (N <= 20): ");
            N = leia.nextInt();

            if (N < 1 || N > 20) {
                System.out.println("Valor inválido! Digite um número entre 1 e 20.");
            }
        } while (N < 1 || N > 20);

        int max = 0;

        // ---- Validação do número máximo ----
        do {
            System.out.print("Digite o valor máximo permitido para os elementos: ");
            max = leia.nextInt();

            if (max < 1) {
                System.out.println("Valor inválido! O máximo deve ser pelo menos 1.");
            }
        } while (max < 1);

        int[] AC = new int[N];

        // ---- Preenchendo o vetor com validação ----
        for (int i = 0; i < N; i++) {
            int valor;

            do {
                System.out.print("Digite o elemento " + (i + 1) + " (<= " + max + "): ");
                valor = leia.nextInt();

                if (valor > max || valor < 0) {
                    System.out.println("Valor inválido! Deve ser entre 0 e " + max + ".");
                }
            } while (valor > max || valor < 0);

            AC[i] = valor;
        }

        // ---- Impressão do vetor ----
        System.out.println("\nVetor AC:");
        for (int i = 0; i < N; i++) {
            System.out.print(AC[i] + " ");
        }

        leia.close();
    }
}


/* Feito por Lucas Soares Vieira */
