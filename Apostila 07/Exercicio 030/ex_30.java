import java.util.Scanner;

public class ex_30 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int leitor = 0; String palavra = "";
		
		while ( leitor != 3){
			System.out.printf("%n1) Criptografar%n2) Descriptografar%n3) Sair:%n Digite: ");
		leitor = leia.nextInt();
		leia.nextLine();
			
			switch ( leitor ){
				case 1:
				System.out.print("Digite a frase que sera criptografada: ");
				palavra = leia.nextLine().trim();
					for (int i = 0; i < palavra.length(); i++){
						char letra = palavra.charAt(i);
						
						if ( letra > 'a' && 'z' < letra){
							letra = (char)((( letra - 'a' + 13) % 26) + 'a');
							} else if (letra > 'A' && 'Z' < letra){
								letra = (char)(((letra - 'a' + 13) % 26) + 'a');
								}
						
						System.out.print((char)letra);
						}
				break;
				
				case 2:
				System.out.print("Digite a frase que sera descriptografada: ");
				palavra = leia.nextLine().trim();
					for (int i = 0; i < palavra.length(); i++){
						char letra = palavra.charAt(i);
						
						if ( letra > 'a' && 'z' < letra){
							letra = (char)((( letra - 'a' + 13) % 26) + 'a');
							} else if (letra > 'A' && 'Z' < letra){
								letra = (char)(((letra - 'a' + 13) % 26) + 'a');
								}
						
						System.out.print((char)letra);
						}
				break;
				}
			}
	}
}

