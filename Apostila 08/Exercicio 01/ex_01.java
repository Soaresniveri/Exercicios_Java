

public class ex_01 {
	
	public static void main (String[] args) {
		int[] numeros = new int[15];
		
		for (int i = 0; i < numeros.length; i++){
		int random = (int)(Math.random() * 20);
		numeros[i] += random;
		System.out.print(numeros[i] + " ");
		}
		
		
	}
}

/* Feito por Lucas Soares Vieira */
