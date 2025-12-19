import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos (N <= 15): ");
        int N = leia.nextInt();

        long[] Y = new long[N];

        long fat = 1;

        for (int i = 0; i < N; i++) {
            if (i == 0 || i == 1) {
                fat = 1;
            } else {
                fat = fat * i;
            }
            Y[i] = fat;
        }

        // Imprime o vetor
        System.out.println("\nSequência de Fatoriais:");
        for (int i = 0; i < N; i++) {
            System.out.print(Y[i] + " ");
        }
    }
}

/* Feito por Lucas Soares Vieira */
