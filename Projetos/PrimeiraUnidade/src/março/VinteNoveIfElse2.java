package março;

import java.util.Scanner;

public class VinteNoveIfElse2 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner (System.in);
		
		int Ano, Nasc;
		
		System.out.println("Qual o ano em que se encontra? ");
		Ano = input.nextInt();
		System.out.println("Qual o ano do seu nascimento? ");
		Nasc = input.nextInt();
		
		int idade = Ano - Nasc;
		
		if(idade>=18 && idade<=70) {
			System.out.println("\nVOTO OBRIGATÓRIO!");
		}else if(idade>=16 || idade>70) {
			System.out.println("\nVOTO FACULTATIVO!");
		}else{
			System.out.println("\nNÃO PODE VOTAR!");
		}
		
	}

}
