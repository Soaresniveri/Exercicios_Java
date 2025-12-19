import java.util.Arrays;
import java.util.Scanner;

public class Ex_32 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Ler frase completa
        System.out.print("Digite uma frase: ");
        String frase = leia.nextLine();

        // Separar palavras usando split
        String[] AN = frase.trim().split("\\s+");

        // Imprimir quantidade de palavras
        System.out.println("\nQuantidade de palavras: " + AN.length);

        // Imprimir vetor original
        System.out.println("Vetor AN original:");
        System.out.println(Arrays.toString(AN));

        // Ordenar crescente
        Arrays.sort(AN);

        // Imprimir vetor ordenado
        System.out.println("\nVetor AN ordenado (crescente):");
        System.out.println(Arrays.toString(AN));

        leia.close();
    }
}

/* Feito por Lucas Soares Vieira */
