package exercicio4;

import java.util.Scanner;

public class Veiculo {
	private int id;
	private String modelo;
	private String placa;
	private String status;
	private double valor;
	
	public void preencherVeiculo(){
		System.out.println("\n------------------------------------------------------");
		System.out.println("Preencher dados do veículo locado:\n");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o Id do veículo locado: ");
		this.id = input.nextInt();
		input.nextLine();
		System.out.println("Digite o Modelo do veículo: ");
		this.modelo = input.nextLine();
		System.out.println("Digite a Placa do veículo: ");
		this.placa = input.nextLine();
		System.out.println("Digite o Status do veículo: ");
		this.status = input.nextLine();
		System.out.println("Digite o Valor do veículo: ");
		this.valor = input.nextDouble();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}