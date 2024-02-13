package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;
	
public class Questao2 {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			ArrayList<String> time1 = new ArrayList<>();
			ArrayList<String> time2 = new ArrayList<>();
			
			String equipe1, equipe2;
			
			System.out.println("Digite o nome da Equipe 1: ");
			equipe1 = input.nextLine();
			System.out.println("Digite o nome da Equipe 2: ");
			equipe2 = input.nextLine();
			
			System.out.println("\n==== Cadastre os jogadores do "+equipe1+" ====");
			for(int i=0; i<11; i++) {
				System.out.println("Digite o nome do "+(i+1)+"º Jogador: ");
				time1.add(input.nextLine());
			}
			
			System.out.println("\n==== Cadastre os jogadores do "+equipe2+" ====");
			for(int i=0; i<11; i++) {
				System.out.println("Digite o nome do "+(i+1)+"º Jogador: ");
				time2.add(input.nextLine());
			}
			
			System.out.println("\nLista do "+equipe1+":" );
			for(int i=0; i<time1.size(); i++) {
				System.out.printf(time1.get(i));
				if((i+1)<time1.size()) {
					System.out.printf(", ");
				}else {
					System.out.printf(".");
				}
			}
			
			System.out.println("\n\nLista do "+equipe2+":" );
			for(int i=0; i<time2.size(); i++) {
				System.out.printf(time2.get(i));
				if((i+1)<time2.size()) {
					System.out.printf(", ");
				}else {
					System.out.printf(".");
				}
			}
		}
}
