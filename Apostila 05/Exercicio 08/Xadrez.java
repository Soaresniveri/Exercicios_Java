import java.util.Scanner;

public class Xadrez {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int Hora_inicio; int Hora_fim; int calc_Hora;
		
		System.out.println("Digite a hora de inicio do jogo");
		Hora_inicio = leia.nextInt();
		
		System.out.println("\n" + "Digite a hora de termino do jogo");
		Hora_fim = leia.nextInt();
		
		if (Hora_inicio < Hora_fim) {
			calc_Hora = Hora_fim - Hora_inicio;
		} else {
			calc_Hora = (24 - Hora_inicio) + Hora_fim;
		}
		
		System.out.printf("\n" + "O jogo durou %d hora(s)%n", calc_Hora);
	}
}

