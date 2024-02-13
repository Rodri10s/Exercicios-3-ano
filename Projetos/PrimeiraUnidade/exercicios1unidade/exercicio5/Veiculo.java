package exercicio5;

import java.util.Scanner;

public class Veiculo {
	private int id;
	private String modelo;
	private String placa;
	private double valor;

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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Veiculo() {

		digitarDados();
	}

	public void digitarDados() {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o Id do veículo: ");
		this.id = input.nextInt();
		input.nextLine();
		System.out.println("Digite o Modelo do veículo: ");
		this.modelo = input.nextLine();
		System.out.println("Digite a Placa do veículo: ");
		this.placa = input.next();
		System.out.println("Digite o valor do Veículo: ");
		this.valor = input.nextDouble();

	}

	public void imprimirTudo() {
		System.out.println("Id do Veículo................: " + getId());
		System.out.println("Nome do Modelo...............: " + getModelo());
		System.out.println("Placa do Veículo.............: " + getPlaca());
		System.out.println("Valor do Veículo.............: " + getValor());
	}
}
