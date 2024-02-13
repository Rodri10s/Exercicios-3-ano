package exercicio3;

import java.util.Scanner;

import abril.TesteMetodo;

public class Metodo {

	public static double area(double alt, double larg) {
		double area = alt * larg;
		return area;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a altura do Quadrilátero: ");
		double altura = input.nextDouble();
		System.out.println("Digite a largura do Quadrilátero: ");
		double largura = input.nextDouble();
		
		double valor = area(altura, largura);

		System.out.println("A área do quadrilátero é de " + area(altura, largura));
		
		TesteMetodo.imparPar(valor);
		
	}

}
