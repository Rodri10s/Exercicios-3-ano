//Pedir 5 valores inteiros ao usuário;
//Imprimir os valores da posição 2 e 3;
//Exibir a soma

package maio;

import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo06 {
	public static void main(String[] args) {
		ArrayList<Integer> valor = new ArrayList();
		
		for(int i=0; i < 5; i++) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Digite o "+(i+1)+"º Número:");
			valor.add(input.nextInt());
		}
		
		int soma = 0;
		for(int i = 0; i < valor.size(); i++) {
			soma = soma + valor.get(i);
		}
		
		System.out.println("\nValor da posição 2: "+valor.get(2));
		System.out.println("Valor da posição 3: "+valor.get(3));
		System.out.println("A soma é igual à: "+soma);
	}

}
