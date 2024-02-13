package abril;

import java.text.DecimalFormat;

import java.util.Scanner;

public class FuncaoMetodo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		DecimalFormat formato = new DecimalFormat("#.##");

		System.out.println("Digite seu nome completo: ");

		String nome = input.nextLine();

		System.out.println("Digite seu peso em kg: ");

		double peso = input.nextDouble();

		System.out.println("Digite sua altura em metros: ");

		double altura = input.nextDouble();

		System.out.println("\n" + nome);

		System.out.println("IMC = " + formato.format(TesteMetodo.IMC(peso, altura)));

		TesteMetodo.Classificação(TesteMetodo.IMC(peso, altura));

	}

}
