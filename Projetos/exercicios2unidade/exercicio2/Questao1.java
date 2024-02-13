package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> lista = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"º número: ");
			lista.add(i, input.nextLine());
		}
		
		System.out.println("Elementos da Lista: ");
		for(int i=0; i<lista.size(); i++) {
			System.out.printf(lista.get(i));
			if((i+1)<lista.size()) {
				System.out.printf(", ");
			}else {
				System.out.printf(".");
			}
		}

}
}
