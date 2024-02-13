package março;

import java.util.Scanner;

public class VinteNoveIfElse {
	public static void main(String[] args) {
		double notaM, notaP, media;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite a nota de Matemática: ");
			notaM = input.nextDouble();
			System.out.println("Digite a nota de Português: ");
			notaP = input.nextDouble();
		}
		
		media = (notaM + notaP)/2;
		
			if(media>=6) {
				System.out.println("\nALUNO APROVADO!");
				if(media==10){
					System.out.println("PARABÉNS, CONTINUE ASSIM!! :)");
				}	
			}else {
				System.out.println("\nALUNO REPROVADO!");
				if(media==0) {
					System.out.println("SE ESFORÇAR MAIS EM SEU BROCHA!");
				}
			}
			
			/*String status = (media >= 6) ? "APROVADO! " : "REPROVADO!"; //Operador Ternário
			String dez = (media == 10) ? "PARABÉNS, CONTINUE ASSIM!! :)" : "";
			System.out.println("\nStatus do Aluno: " + status + dez);*/
			System.out.println("Média: " + media);
	}
}
