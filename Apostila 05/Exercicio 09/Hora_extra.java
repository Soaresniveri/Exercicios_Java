import java.util.Scanner;

public class Hora_extra {
	
	public static void main (String[] args) {
		int horas_trab;
		int horas_extra_trab;
		double valor_hora = 12.50;
		double valor_hora_extra = 18.75;
		double salario = 2000;
		double salario_extra; 
		Scanner leia = new Scanner ( System.in );
		
		System.out.println("Coloque a quantidade de horas trabalhadas");
		horas_trab = leia.nextInt();
		
		if ( horas_trab > 40 ) {
			horas_extra_trab = horas_trab - 40;
			salario_extra = horas_extra_trab * valor_hora_extra;
			salario = salario + salario_extra;
			
			System.out.println("\n" + "A quantidade de horas extras trabalhadas e de: " + horas_extra_trab + " horas" + "\n" + "o novo salario e de: " + salario );
			} else {
			System.out.println("\n" + "Seu salario tera reajustes... para menos");
			}
	}
}

