import java.util.Scanner;

public class ex_12 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String palavra = " ";
		int a = 0; int e = 0; int i = 0; int o = 0; int u = 0;
		
		System.out.print("Digite algo: ");
		palavra = leia.nextLine().toLowerCase();
		
		for (int l = 0; l < palavra.length(); l++ ){
			char caracter = palavra.charAt(l);
			
			if (caracter == 'a'){
				a++;
				}
			
			if (caracter == 'e'){
				e++;
				}
			
			if (caracter == 'i'){
				i++;
				}
				
			if (caracter == 'o'){
				o++;
				}
				
			if (caracter == 'u'){
				u++;
				}
			}
			
		System.out.printf("a = %d%n e = %d%n i = %d%n o = %d%n u = %d%n", a, e, i, o, u);
	}
}

