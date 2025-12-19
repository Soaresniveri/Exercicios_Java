

public class ex_02 {
	
	public static void main (String[] args) {
		int[] numeros = new int[15];
		
		for ( int i = 0; i < numeros.length; i++){
			int random = (int)(Math.random() * 20);
			numeros[i] = random;
			
			for ( int n = 14; n >= 0; n--){
				System.out.print(numeros[i] + " ");
				break;
				}
			}
	}
}

/* Feito por Lucas Soares Vieira */
