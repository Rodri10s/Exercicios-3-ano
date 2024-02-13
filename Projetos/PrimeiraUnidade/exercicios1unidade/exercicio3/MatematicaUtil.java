package exercicio3;

import java.util.Scanner;

import abril.TesteMetodo;

	public class MatematicaUtil{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		TesteMetodo test = new TesteMetodo();

		System.out.println("Digite seu ano de nascimento: ");

		test.nasc = input.nextInt();

		System.out.println("Digite o ano atual: ");

		test.atual = input.nextInt();

		System.out.println("Sua idade é = " + TesteMetodo.calcularIdade(test.nasc, test.atual));

	}

}
