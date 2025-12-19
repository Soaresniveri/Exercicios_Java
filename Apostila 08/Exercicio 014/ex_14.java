public class ex_14 {
	
	public static void main (String[] args) {
		int[] S = new int [10], T = new int [15], U = new int [ S.length + T.length ];
		
		
		// Alimenta o S
		for ( int i = 0; i < S.length; i++){
			int random = (int)(Math.random() * 20);
			S[i] = random;
			}
		
		// Alimenta o T
		for ( int i = 0; i < T.length; i++){
			int random = (int)(Math.random() * 20);
			T[i] = random;
			}
		
		int indexS = 0;
		int indexT = 0;
		
		for (int i = 0; i < U.length; i++){
			if (i % 2 == 0) {               
				if (indexS < S.length) {
					U[i] = S[indexS];
					indexS++;
					
				} else {                    
					U[i] = T[indexT];
					indexT++;
				}
				
			} else {                        
				if (indexT < T.length) {
					U[i] = T[indexT];
					indexT++;
				} else {
					U[i] = S[indexS];
					indexS++;
				}
			}
		}
	}
}
/* Feito por Lucas Soares Vieira */
