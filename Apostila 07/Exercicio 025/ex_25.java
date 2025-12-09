import java.util.Scanner;

public class ex_25 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String senha = " "; boolean Senha_aprovada = false;
		
		while ( Senha_aprovada != true ){
			int senha_qtd = 0; int letras = 0; int numeros = 0; int simbolos = 0;
			// Pede a senha pro Usuario //
			System.out.println();
			System.out.print("Digite a sua senha, ela deve ter no minimo 10 caracteres: ");
			senha = leia.nextLine().trim().toLowerCase();
			
			// 1 Verificacao
			
			senha_qtd = senha.length();
			

			// percorre a senha
			for ( int i = 0; i < senha.length(); i++){
				char caracter = senha.charAt(i);
				
				// 2 Verificacao 
				if ( caracter >= 'a' && caracter <= 'z'){
					letras++;
					}
				
				// 3 verificacao
				if ( caracter >= '0' && caracter <= '9'){
					numeros++;
					}
				
				// 4 verificacao
				int codigo = (int) caracter;
				if ( (codigo >= 33 && codigo <= 47) ||
				(codigo >= 58 && codigo <= 64) ||
				(codigo >= 91 && codigo <= 96) ||
				(codigo >= 123 && codigo <= 126) ) {
				simbolos++;
				}
			}
			
			if (( senha_qtd >= 10 ) && 
				( letras >= 3) && 
				( numeros >= 3) &&
				( simbolos >= 2) ){
					Senha_aprovada = true;
					System.out.printf("Tamanho 10: %d%nLetras 3: %d%nNumeros 3: %d%nSimbolos 2: %d%n", senha_qtd, letras, numeros, simbolos);
					System.out.println("Senha aprovada! Parabens! ");
					break;
					} else {
						System.out.printf("Tamanho 10: %d%nLetras 3: %d%nNumeros 3: %d%nSimbolos 2: %d%n", senha_qtd, letras, numeros, simbolos);
						System.out.println("Senha invalida! Tente novamente...");
						}
			
		}
	}
}

/* Feito por Lucas Soares Vieira */
