import java.util.Scanner;

public class ex_27 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N = 0;

        // Lendo AH (mínimo 25)
        do {
            System.out.print("Digite o tamanho do vetor AH (>= 25): ");
            N = leia.nextInt();

            if (N < 25) {
                System.out.println("Erro! O vetor AH deve ter pelo menos 25 posições.");
            }

        } while (N < 25);

        int[] AH = new int[N];

        // Preenchendo AH
        for (int i = 0; i < N; i++) {
            System.out.print("Digite AH[" + i + "]: ");
            AH[i] = leia.nextInt();
        }

        // Lendo AI (entre 2 e 5 elementos)
        int M = 0;
        do {
            System.out.print("\nDigite o tamanho do vetor AI (2 a 5): ");
            M = leia.nextInt();

            if (M < 2 || M > 5) {
                System.out.println("Erro! O vetor AI deve ter entre 2 e 5 posições.");
            }

        } while (M < 2 || M > 5);

        int[] AI = new int[M];

        // Preenchendo AI
        for (int i = 0; i < M; i++) {
            System.out.print("Digite AI[" + i + "]: ");
            AI[i] = leia.nextInt();
        }

        // Procurar AI dentro de AH
        int posicao = -1; // -1 significa "não encontrado"

        for (int i = 0; i <= N - M; i++) {
            boolean igual = true;

            for (int j = 0; j < M; j++) {
                if (AH[i + j] != AI[j]) {
                    igual = false;
                    break;
                }
            }

            if (igual) {
                posicao = i;
                break;
            }
        }

        // Resultado
        if (posicao == -1) {
            System.out.println("\nERRO: O vetor AI NÃO está contido em AH!");
        } else {
            System.out.println("\nO vetor AI está contido em AH na posição inicial: " + posicao);
        }

        leia.close();
    }
}

/* Feito por Lucas Soares Vieira */
