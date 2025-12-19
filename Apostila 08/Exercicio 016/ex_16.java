import java.util.Scanner;

public class ex_16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos (N <= 20): ");
        int N = leia.nextInt();

        int[] V = new int[N];

        // Preenche o vetor Fibonacci
        for (int i = 0; i < N; i++) {
            if (i == 0 || i == 1) {
                V[i] = 1;
            } else {
                V[i] = V[i-1] + V[i-2];
            }
        }

        // Imprime o vetor
        System.out.println("\nSequência de Fibonacci:");
        for (int i = 0; i < N; i++) {
            System.out.print(V[i] + " ");
        }
    }
}

/* Feito por Lucas Soares Vieira */
