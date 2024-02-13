package exercicio4;

public class CadastroProduto {
	public static void main(String[] args) {

		Produto prod1 = new Produto();
		Produto prod2 = new Produto();
		Produto prod3 = new Produto();

		prod1.setId(111111111);
		prod1.setNome("Motorola Moto G100");
		prod1.setDescricao("Smartphone 4G");
		prod1.setCodigoBarras("098765432165");
		prod1.setValor(1600.00);

		prod2.setId(222222222);
		prod2.setNome("Samsung Galaxy S21");
		prod2.setDescricao("Smartphone 5G");
		prod2.setCodigoBarras("012345678901");
		prod2.setValor(3700.50);

		prod3.setId(333333333);
		prod3.setNome("Iphone XYZ");
		prod3.setDescricao("Nem é celular, é Iphone");
		prod3.setCodigoBarras("018265926394");
		prod3.setValor(5300.00);

		prod1.ImprimirTudo();
		prod2.ImprimirTudo();
		prod3.ImprimirTudo();
	}

}
