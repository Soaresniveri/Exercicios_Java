import java.util.Scanner;

public class ex_20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] AA = new int[10];

        // Leitura do vetor
        for (int i = 0; i < AA.length; i++) {
            System.out.print("Digite um número: ");
            AA[i] = leia.nextInt();
        }

        // Ordenação simples (decrescente)
        for (int i = 0; i < AA.length; i++) {
            for (int j = i + 1; j < AA.length; j++) {
                if (AA[j] > AA[i]) {
                    int aux = AA[i];
                    AA[i] = AA[j];
                    AA[j] = aux;
                }
            }
        }

        // Impressão do vetor ordenado
        System.out.println("\nVetor ordenado (decrescente):");
        for (int i = 0; i < AA.length; i++) {
            System.out.print(AA[i] + " ");
        }

        leia.close();
    }
}

/* Feito por Lucas Soares Vieira */
