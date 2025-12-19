import java.util.Scanner;

public class Ex_28 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // ---------- LER TAMANHO DO VETOR AH ----------
        int tamAH;
        do {
            System.out.print("Digite o tamanho do vetor AH (>= 25): ");
            tamAH = leia.nextInt();
        } while (tamAH < 25);

        int[] AH = new int[tamAH];

        // ---------- LER ELEMENTOS DE AH ----------
        System.out.println("\nDigite os elementos de AH:");
        for (int i = 0; i < AH.length; i++) {
            System.out.printf("AH[%d] = ", i);
            AH[i] = leia.nextInt();
        }

        // ---------- LER TAMANHO DO VETOR AI ----------
        int tamAI;
        do {
            System.out.print("\nDigite o tamanho do vetor AI (entre 2 e 5): ");
            tamAI = leia.nextInt();
        } while (tamAI < 2 || tamAI > 5);

        int[] AI = new int[tamAI];

        // ---------- LER ELEMENTOS DE AI ----------
        System.out.println("\nDigite os elementos de AI:");
        for (int i = 0; i < AI.length; i++) {
            System.out.printf("AI[%d] = ", i);
            AI[i] = leia.nextInt();
        }

        // ---------- PROCURAR TODAS AS OCORRÊNCIAS DE AI EM AH ----------
        boolean achou = false;

        System.out.println("\nVerificando ocorrências...");
        for (int i = 0; i <= AH.length - AI.length; i++) {
            boolean igual = true;

            // Verifica se a sequência começa em AH[i]
            for (int j = 0; j < AI.length; j++) {
                if (AH[i + j] != AI[j]) {
                    igual = false;
                    break;
                }
            }

            if (igual) {
                achou = true;
                System.out.println("AI encontrado a partir da posição AH[" + i + "]");
            }
        }

        if (!achou) {
            System.out.println("AI NÃO está contido dentro de AH!");
        }
    }
}

/* Feito por Lucas Soares Vieira */
