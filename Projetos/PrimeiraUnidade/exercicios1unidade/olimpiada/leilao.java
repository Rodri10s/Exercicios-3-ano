package olimpiada;

import java.util.Scanner;

public class leilao {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n, v, maior=0;
		String c;
		
		n = input.nextInt();
		input.nextLine();
		
		for(int i=0; i<n; i++) {
			c = input.nextLine();
			v = input.nextInt();
			
			if(v>maior) {
				maior = v;
			}
		}
	}
	
}
