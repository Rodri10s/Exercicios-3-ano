package abril;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MetodoConstrutor {
	private int id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double valor;

	public MetodoConstrutor(int id, String nome, String descricao, String codigoBarras, double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.codigoBarras = codigoBarras;
		this.valor = valor;
	}

	public MetodoConstrutor() {
		escreverDados();
	}
	
	public void escreverDados() {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o Id do produto: ");
		this.id = input.nextInt();
		input.nextLine();
		System.out.println("Digite o Nome do produto: ");
		this.nome = input.nextLine();
		System.out.println("Digite a Descrição do produto: ");
		this.descricao = input.nextLine();
		System.out.println("Digite o Código de Barras do produto: ");
		this.codigoBarras = input.nextLine();
		System.out.println("Digite o Valor do produto: ");
		this.valor = input.nextDouble();
		System.out.println("\n");
	}

	public void imprimirTudo() {
		
		DecimalFormat formato = new DecimalFormat("###,###.##");
		
		System.out.println("\nId do produto..............: " + getId());
		System.out.println("Nome do produto............: " + getNome());
		System.out.println("Descrição do produto.......: " + getDescricao());
		System.out.println("Código de Barras do produto: " + getCodigoBarras());
		System.out.println("Valor do produto...........: " + formato.format(getValor()));
	}

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
	
}
