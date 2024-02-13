package abril;

public class TesteMetodo {

	public int nasc, atual;

	public static int calcularIdade(int nasc, int atual) {

		int resultado = atual - nasc;

		return resultado;

	}

	public static double IMC(double peso, double altura) {

		double resultado = peso / (altura * altura);

		return resultado;

	}

	public static void Classificação(double IMC) {

		if (IMC < 18.5) {

			System.out.println("Abaixo do peso");

		} else if (IMC < 25) {

			System.out.println("Peso ideal!");

		} else if (IMC < 30) {

			System.out.println("Levemente acima do peso");

		} else if (IMC < 35) {

			System.out.println("Obesidade grau I");

		} else if (IMC < 40) {

			System.out.println("Obesidade grau II (Severa)");

		} else {

			System.out.println("Obesidade III (Mórbida)");

		}

	}

	public static void imparPar(double valor) {
		if(valor % 2 == 0) {
			System.out.println("Número Par");
		}else {
			System.out.println("Número Ímpar");
		}
	}
}
