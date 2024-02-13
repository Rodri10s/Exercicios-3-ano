package exercicio5;

import java.util.Scanner;

public class Locacao {
	private int id;
	private String status;
	private double valorTotal;
	private int qtdDiarias;
	private Veiculo veiculo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getQtdDiarias() {
		return qtdDiarias;
	}

	public void setQtdDiarias(int qtdDiarias) {
		this.qtdDiarias = qtdDiarias;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Locacao() {
		digitarDados();	
	}
	
	public void digitarDados() {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o Id da locação: ");
		this.id = input.nextInt();
		input.nextLine();
		System.out.println("Digite o Status da locação: ");
		this.status = input.nextLine();
		System.out.println("Digite o valor total da locação: ");
		this.valorTotal = input.nextDouble();
		System.out.println("Digite a quantidade de diárias: ");
		this.qtdDiarias = input.nextInt();

	}

	public void imprimirTudo() {
		
		Veiculo vei = new Veiculo();
		
		System.out.println("\nId da Locação................: " + getId());
		System.out.println("Status da Locação............: " + getStatus());
		System.out.println("Valor total da Locação.......: " + getValorTotal());
		System.out.println("Quantidade de diárias........: " + getQtdDiarias());
		vei.imprimirTudo();
		
	}

}
