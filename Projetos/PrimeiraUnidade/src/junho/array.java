package junho;

public class array {
	public static void main(String[] args) {
		
		//Exemplo 01 (elementos de um array como valores padrão de zero)
		
		System.out.println("EXEMPLO 01");
		
		int[] array = new int[10];
		
		System.out.printf("\n%s%11s\n", "Posição", "Pontuação");
		
		for(int posi=1; posi<array.length; posi++) {
			System.out.printf("%4d%10d\n", posi, array[posi]);
		}
		
		//Exemplo 02 (elementos de um array com um inicializador dde array)
		
		System.out.println("\nEXEMPLO 02");
		
		int[] array2 = { 10, 87, 45, 76, 13, 86, 73, 53, 65, 46 };
		
		System.out.printf("\n%s%11s\n", "Posição", "Pontuação");
		
		for(int posi2=0; posi2<array2.length; posi2++) {
			System.out.printf("%4d%10d\n", posi2, array2[posi2]);
		}
		
		//Exemplo 03 (Calculando valores a serem colocados em elementos de um array)
		
				System.out.println("\nEXEMPLO 03");
				
				final int arrayLength = 10; //variável de valor fixo, que não pode ser modificado posteriormente
				
				int[] array3 = new int[arrayLength];
				
				for(int posi3=0; posi3<array3.length; posi3++) {
					array3[posi3] = 2 + 2 * posi3;
				}
				
				System.out.printf("\n%s%11s\n", "Posição", "Pontuação");
				
				for(int posi3=0; posi3<array3.length; posi3++) {
					System.out.printf("%4d%10d\n", posi3, array3[posi3]);
				}
	}

}
