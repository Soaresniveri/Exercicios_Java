import java.util.Scanner;

public class ex_21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] AB = new int[10];

        // Leitura do vetor
        for (int i = 0; i < AB.length; i++) {
            System.out.print("Digite um número: ");
            AB[i] = leia.nextInt();
        }

        // Transformação: ímpares viram pares (multiplica por 2)
        for (int i = 0; i < AB.length; i++) {
            if (AB[i] % 2 != 0) {   // se for ímpar
                AB[i] = AB[i] * 2;
            }
        }

        // Exibição do vetor final
        System.out.println("\nVetor resultante:");
        for (int i = 0; i < AB.length; i++) {
            System.out.print(AB[i] + " ");
        }

        leia.close();
    }
}

/* Feito por Lucas Soares Vieira */
