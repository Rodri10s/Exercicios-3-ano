package exercicio4;

public class Produto {

	private int id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double valor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void ImprimirTudo() {
		System.out.println("\nId do produto..............: " + getId());
		System.out.println("Nome do produto............: " + getNome());
		System.out.println("Descrição do produto.......: " + getDescricao());
		System.out.println("Código de Barras do produto: " + getCodigoBarras());
		System.out.println("Valor do produto...........: " + getValor());

	}

}
