package exercicio3;

import java.util.List;
import java.util.Scanner;

public class Locacao {
	private int id;
	private String status;
	private double valorTotal;
	private int qtdDiarias;
	private double valorDesconto;
	private double valorPagar;
	private List<Veiculo> veiculosLocados;

	public void preencherLocacao() {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o Id da locação: ");
		this.id = input.nextInt();
		input.nextLine();
		System.out.println("Digite o Status da locação: ");
		this.status = input.nextLine();
		System.out.println("Digite a Quantidade de Diárias da locação: ");
		this.qtdDiarias = input.nextInt();
	}

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

	public void setValorTotal() {
		double soma = 0;
		for(int i=0; i < veiculosLocados.size(); i++) {
			soma += this.veiculosLocados.get(i).getValorDiaria();
		}
		this.valorTotal = soma * this.qtdDiarias;
	}

	public int getQtdDiarias() {
		return qtdDiarias;
	}

	public void setQtdDiarias(int qtdDiarias) {
		this.qtdDiarias = qtdDiarias;
	}

	public double getValorDesconto() {
		
		return valorDesconto;
	}

	public void setValorDesconto() {
		this.valorDesconto = (this.valorTotal*5)/100;
	}

	public List<Veiculo> getVeiculosLocados() {
		return veiculosLocados;
	}

	public void setVeiculosLocados(List<Veiculo> veiculosLocados2) {
		this.veiculosLocados = veiculosLocados2;
	}

	public double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar() {
		this.valorPagar = this.valorTotal - this.valorDesconto;
	}

}