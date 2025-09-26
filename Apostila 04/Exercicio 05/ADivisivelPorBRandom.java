public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		
		int A_random = (int) (Math.random() * 1000);
		int B_random = (int) (Math.random() * 20) + 1;
		
		if ( A_random % B_random == 0) {
			System.out.println("A e divisivel por B");
		} else {
			System.out.println("A nao e divisivel por B");
		}
			
		System.out.println("O valor de A é " + A_random);
		System.out.println("O valor de B é " + B_random);
	}
}

