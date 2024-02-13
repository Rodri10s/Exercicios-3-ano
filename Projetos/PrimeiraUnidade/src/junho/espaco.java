package junho;

public class espaco {
	public static void main(String[] args) {
		
		System.out.printf("%s%11s\n", "Posição", "Pontuação");
		
		int pont = 9;		
		for(int posi=1; posi<10; posi++) {
			System.out.printf("%4d%10d\n", posi, pont);
			--pont;
		}
	}

}
