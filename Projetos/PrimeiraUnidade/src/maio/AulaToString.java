package maio;

public class AulaToString {
	public static void main(String[] args) {
		Pizza piz = new Pizza();
		piz.nome = "Portuguesa";
		
		Pizza piz2 = piz;
		
		System.out.println(piz.nome);
		System.out.println(piz2.nome);
	}

}
