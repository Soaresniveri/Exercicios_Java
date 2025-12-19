import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex_29 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Random gerador = new Random();

        // ---------------- LER TAMANHO DO VETOR AJ ----------------
        int tamAJ;
        do {
            System.out.print("Digite o tamanho do vetor AJ (>= 10): ");
            tamAJ = leia.nextInt();
        } while (tamAJ < 10);

        int[] AJ = new int[tamAJ];

        // ---------------- GERAR ELEMENTOS ALEATÓRIOS E NÃO REPETIDOS ----------------
        for (int i = 0; i < AJ.length; i++) {
            int numero;
            boolean repetido;

            do {
                numero = gerador.nextInt(10000); // Número grande (0 a 9999)
                repetido = false;

                // Verificar se o número já existe no vetor
                for (int j = 0; j < i; j++) {
                    if (AJ[j] == numero) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);

            AJ[i] = numero;
        }

        // ---------------- ORDENAR O VETOR ----------------
        Arrays.sort(AJ);

        int tentativas = 10;
        boolean acertou = false;
        int chute = 0;

        System.out.println("\nTente adivinhar um número presente no vetor AJ!");
        System.out.println("Você tem 10 tentativas.\n");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            chute = leia.nextInt();

            // Verificar se o chute está no vetor (busca simples)
            for (int j = 0; j < AJ.length; j++) {
                if (AJ[j] == chute) {
                    acertou = true;
                    System.out.println("\nPARABÉNS! Você acertou!");
                    System.out.println("O número " + chute + " está na posição AJ[" + j + "].\n");
                    System.out.println("Vetor AJ completo:");
                    System.out.println(Arrays.toString(AJ));
                    return;
                }
            }

            System.out.println("Errado!\n");
        }

        // ---------------- SE NÃO ACERTOU ----------------
        if (!acertou) {
            System.out.println("\nVocê errou todas as tentativas!");
            System.out.println("O vetor AJ era:");
            System.out.println(Arrays.toString(AJ));
        }
    }
}

/* Feito por Lucas Soares Vieira */
