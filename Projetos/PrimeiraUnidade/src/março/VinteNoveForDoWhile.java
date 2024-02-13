package março;

import java.util.Scanner;

public class VinteNoveForDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		/*-------------WHILE--------------
		
		System.out.println("Digite o limite de parada: ");
		int parada = input.nextInt();
		
		int c = 1; //contador
		
		while(c<=parada) {
			System.out.println("\n" + c );
			c++;
		}
		*/
		
		/*-------------FOR----------------
		
		System.out.println("Digite o limite de parada: ");
		//int parada = input.nextInt();
		 
		for(int c = 1; c<=parada; c++) {
			System.out.println("\n" + c );
		}
		*/
		
		/*----------DO WHILE--------------
		
		int c = 1, n, maior=0;
		
		System.out.println("Digite 5 números: \n");
		
		do{
			System.out.println(c + "º Número: ");
			n = input.nextInt();
			c++;
				if(n>maior){
					maior = n;
				}
		}while(c <= 5);
		
		System.out.println("O maior número digitado foi: " + maior);
		*/
	}

}
