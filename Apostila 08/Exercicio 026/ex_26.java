import java.util.Scanner;

public class ex_26 {

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int N = leia.nextInt();

        int[] AG = new int[N];

        // Leitura do vetor
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            AG[i] = leia.nextInt();
        }

        // Ordenar APENAS números primos (crescente)
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {

                // Só troca se os DOIS forem primos
                if (ehPrimo(AG[i]) && ehPrimo(AG[j])) {
                    if (AG[j] < AG[i]) {
                        int aux = AG[i];
                        AG[i] = AG[j];
                        AG[j] = aux;
                    }
                }
            }
        }

        // Imprimir vetor final
        System.out.println("\nVetor final (somente primos em ordem crescente):");
        for (int i = 0; i < N; i++) {
            System.out.print(AG[i] + " ");
        }

        leia.close();
    }
}

/* Feito por Lucas Soares Vieira */
