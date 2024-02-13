package exercicio1_e_2;

//						QUESTÃO 01

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = input.nextLine();
		
		int c = 1; //contador
		
		while(c<=10000) {
			System.out.println(frase);
			c++;
		}
	}

}


/*						QUESTÃO 02
 
package março;

import java.util.Scanner;

public class Exercício02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = input.nextLine();
		System.out.println("Quantas vezes deseja que a frase seja repetida? ");
		int limite = input.nextInt();
		
		int c = 1; //contador
		
		while(c<=limite) {
			System.out.println(frase);
			c++;
		}
	}

}
*/

/*				QUESTÃO 03
 
package março;

public class Exercício02 {
	public static void main(String[] args) {

		int c = 100; //contador
		
		while(c<=1000) {
			System.out.println(c);
			c++;
		}
	}

}
*/

/*				QUESTÃO 04

package março;

public class Exercício02 {
	public static void main(String[] args) {

		int c = 1000; //contador
		
		while(c>=100) {
			System.out.println(c);
			c--;
		}
	}

}
*/

/*							QUESTÃO 05

package março;

import java.util.Scanner;

public class Exercício02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um valor inteiro entre 1 e 10: ");
		int n = input.nextInt();

		int c = 1, resultado = 0;

		while (c <= 10) {
			resultado = n * c;
			System.out.println(n + " X " + c + " = " + resultado);
			c++;
		}
	}

}
*/

/*						QUESTÃO 06

package março;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		DecimalFormat formato = new DecimalFormat("#.##");

		System.out.println("Digite seu nome completo: ");
		String nome = input.nextLine();
		System.out.println("Digite seu peso em kg: ");
		double peso = input.nextDouble();
		System.out.println("Digite sua altura em metros: ");
		double altura = input.nextDouble();

		double IMC = peso / (altura * altura);
		System.out.println("\n" + nome);
		System.out.println("IMC = " + formato.format(IMC));

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
}
*/
