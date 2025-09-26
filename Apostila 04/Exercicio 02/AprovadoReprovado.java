import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Coloque sua nota: ");
		int nota = leia.nextInt();
		
		if (nota > 10 | nota < 0 )
		{
			System.out.print("Valor Invalido");
		}
		else if (nota >= 6 & nota <= 10) {
			System.out.print("APROVADO");
		} 
		else 
		{
			System.out.print("REPROVADO");
		}
	}
}
/* Feito por Lucas Soares */
