import java.util.Scanner;

public class ex_17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos (N <= 20): ");
        int N = leia.nextInt();

        int[] X = new int[N];
        int numero = 2;   // Primeiro número primo
        int contador = 0; // Quantos primos já coloquei no vetor

        while (contador < N) {
            boolean primo = true;

            // Verifica se "numero" é primo
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            // Se for primo, adiciona no vetor
            if (primo) {
                X[contador] = numero;
                contador++;
            }

            numero++;
        }

        // Imprime o vetor
        System.out.println("\nSequência de Primos:");
        for (int i = 0; i < N; i++) {
            System.out.print(X[i] + " ");
        }
    }
}

/* Feito por Lucas Soares Vieira */
