package exercicio4;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Locacao {
	private int id;
	private String status;
	private double subTotal;
	private int qtdDiarias;
	private double valorDesconto;
	private double valorTotal;
	private List<Veiculo> veiculosLocados;
	private Cliente cliente;

	public void preencherLocacao() {
		Scanner input = new Scanner(System.in);
		Random gerador = new Random();

		this.id = gerador.nextInt(999);
		setStatus("Ativa");
		System.out.println("Digite a Quantidade de Diárias da locação: ");
		this.qtdDiarias = input.nextInt();
	}

	public void imprimirTudo() {
		// Cupom Fiscal
		DecimalFormat formato = new DecimalFormat();
		formato.applyPattern("R$ #,##0.00");

		System.out.println("\n\n==================== CUPOM FISCAL ====================");
		System.out.printf("Id da Locação: %d", getId());
		System.out.printf("\nStatus: " + getStatus());
		System.out.printf("\nQuantidade de Diárias: " + getQtdDiarias());
		System.out.println("\n------------------------------------------------------");

		System.out.printf("Id do Cliente: %d", getCliente().getId());
		System.out.printf("\nNome: " + getCliente().getNome());
		System.out.printf("\nCPF: " + getCliente().getCpf());
		System.out.printf("\nWhatsapp: " + getCliente().getWhatsapp());

		System.out.printf("\n\nId do Endereço: " + getCliente().getEndereco().getId());
		System.out.printf("\nEstado: " + getCliente().getEndereco().getEstado());
		System.out.printf("\nCEP: " + getCliente().getEndereco().getCep());
		System.out.printf("\nCidade: " + getCliente().getEndereco().getCidade());
		System.out.printf("\nBairro: " + getCliente().getEndereco().getBairro());
		System.out.printf("\nRua: " + getCliente().getEndereco().getRua());
		System.out.printf("\nNúmero: " + getCliente().getEndereco().getNumero());
		System.out.println("\n------------------------------------------------------");

		for (int i = 0; i < getVeiculosLocados().size(); i++) {
			System.out.printf("Id do %dº Veículo: %d", i + 1, getVeiculosLocados().get(i).getId());
			System.out.printf("\nModelo: " + getVeiculosLocados().get(i).getModelo());
			System.out.printf("\nPlaca: " + getVeiculosLocados().get(i).getPlaca());
			System.out.printf("\nStatus: " + getVeiculosLocados().get(i).getStatus());
			System.out.printf("\nValor: " + formato.format(getVeiculosLocados().get(i).getValor()));
			System.out.println("\n");
		}

		setSubTotal();
		setValorDesconto();
		setValorTotal();

		System.out.println("======================================================");
		System.out.println("SubTotal: " + formato.format(getSubTotal()));
		System.out.println("Desconto de 5%: " + formato.format(getValorDesconto()));
		System.out.println("\nValor Total: " + formato.format(getValorTotal()));
		System.out.println("======================================================");
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

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal() {
		double soma = 0;
		for (int i = 0; i < veiculosLocados.size(); i++) {
			soma += this.veiculosLocados.get(i).getValor();
		}
		this.subTotal = soma * this.qtdDiarias;
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
		this.valorDesconto = (this.subTotal * 5) / 100;
	}

	public List<Veiculo> getVeiculosLocados() {
		return veiculosLocados;
	}

	public void setVeiculosLocados(List<Veiculo> veiculosLocados2) {
		this.veiculosLocados = veiculosLocados2;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal() {
		this.valorTotal = this.subTotal - this.valorDesconto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}