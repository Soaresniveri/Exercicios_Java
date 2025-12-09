import java.util.Random;

public class ex_26 {

    public static void main(String[] args) {

        Random rd = new Random();
        String seq = "";

        // 1) gerar string de 100 letras minúsculas
        for (int i = 0; i < 100; i++) {
            char letra = (char) ('a' + rd.nextInt(26));
            seq += letra;
        }

        System.out.println("Sequencia gerada:");
        System.out.println(seq + "\n");

        // 2) Letras que NÃO aparecem (sem array)
        System.out.print("Letras que NÃO aparecem: ");
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        boolean encontrou = false;

        for (int i = 0; i < alfabeto.length(); i++) {
            char letra = alfabeto.charAt(i);
            if (seq.indexOf(letra) == -1) {  // não existe na string
                System.out.print(letra + " ");
                encontrou = true;
            }
        }
        if (!encontrou) System.out.print("Nenhuma");
        System.out.println("\n");

        // 3) Maior sequência de letras repetidas
        String maiorRep = "";
        String atualRep = "";

        for (int i = 0; i < seq.length(); i++) {
            if (i == 0 || seq.charAt(i) == seq.charAt(i - 1)) {
                atualRep += seq.charAt(i);
            } else {
                atualRep = "" + seq.charAt(i);
            }
            if (atualRep.length() > maiorRep.length()) {
                maiorRep = atualRep;
            }
        }

        System.out.println("Maior sequencia repetida: " + maiorRep);

        // 4) Maior sequência de vogais
        String vogais = "aeiou";
        String maiorVogal = "";
        String atualVogal = "";

        for (int i = 0; i < seq.length(); i++) {
            char c = seq.charAt(i);
            if (vogais.indexOf(c) != -1) { // é vogal
                atualVogal += c;
            } else {
                atualVogal = "";
            }
            if (atualVogal.length() > maiorVogal.length()) {
                maiorVogal = atualVogal;
            }
        }

        System.out.println("Maior sequencia de vogais: " + maiorVogal);

        // 5) Maior sequência alfabética (a→b→c→d…)
        String maiorAlfa = "" + seq.charAt(0);
        String atualAlfa = "" + seq.charAt(0);

        for (int i = 1; i < seq.length(); i++) {
            if (seq.charAt(i) == seq.charAt(i - 1) + 1) {
                atualAlfa += seq.charAt(i);
            } else {
                atualAlfa = "" + seq.charAt(i);
            }

            if (atualAlfa.length() > maiorAlfa.length()) {
                maiorAlfa = atualAlfa;
            }
        }

        System.out.println("Maior sequencia alfabetica: " + maiorAlfa);
    }
}

/* Feito por Lucas Soares Vieira */
