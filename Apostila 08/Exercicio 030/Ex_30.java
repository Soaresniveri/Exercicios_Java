import java.util.Arrays;
import java.util.Scanner;

public class Ex_30 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // ---------------- LER TAMANHO DO VETOR AK ----------------
        int n;
        do {
            System.out.print("Digite o tamanho do vetor AK (>= 2): ");
            n = leia.nextInt();
        } while (n < 2); // precisa ter pelo menos 2 elementos

        double[] AK = new double[n];

        // ---------------- LER ELEMENTOS DO VETOR ----------------
        for (int i = 0; i < AK.length; i++) {
            System.out.print("Digite o valor AK[" + i + "]: ");
            AK[i] = leia.nextDouble();
        }

        // ---------------- ORDENAR CRESCENTE ----------------
        Arrays.sort(AK);

        // ---------------- CRIAR O VETOR AL ----------------
        // AL terá tamanho (n - 1), pois é a média de pares consecutivos
        double[] AL = new double[n - 1];

        for (int i = 0; i < AL.length; i++) {
            AL[i] = (AK[i] + AK[i + 1]) / 2.0;
        }

        // ---------------- IMPRIMIR RESULTADOS ----------------
        System.out.println("\nVetor AK (ordenado crescente):");
        System.out.println(Arrays.toString(AK));

        System.out.println("\nVetor AL (médias entre elementos consecutivos):");
        System.out.println(Arrays.toString(AL));
    }
}

/* Feito por Lucas Soares Vieira */
