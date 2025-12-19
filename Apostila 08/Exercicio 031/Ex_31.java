import java.util.Arrays;
import java.util.Scanner;

public class Ex_31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N;
        do {
            System.out.print("Digite a quantidade de elementos (N <= 10): ");
            N = leia.nextInt();
            leia.nextLine(); // limpar buffer
        } while (N < 1 || N > 10);

        String[] AM = new String[N];

        // Leitura das Strings
        for (int i = 0; i < N; i++) {
            System.out.print("Digite a String " + (i + 1) + ": ");
            AM[i] = leia.nextLine();
        }

        // Imprimir vetor original
        System.out.println("\nVetor AM original:");
        System.out.println(Arrays.toString(AM));

        // Ordenar crescente (ordem alfabética)
        Arrays.sort(AM);

        // Imprimir vetor ordenado
        System.out.println("\nVetor AM ordenado (crescente):");
        System.out.println(Arrays.toString(AM));

        leia.close();
    }
}

/* Feito por Lucas Soares Vieira */
