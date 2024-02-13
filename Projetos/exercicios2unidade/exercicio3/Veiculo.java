package exercicio3;

import java.util.Scanner;

public class Veiculo {
	private int id;
	private String modelo;
	private double valorDiaria;
	
	public void preencherVeiculo(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o Id do veículo: ");
		this.id = input.nextInt();
		input.nextLine();
		System.out.println("Digite o Modelo do veículo: ");
		this.modelo = input.nextLine();
		System.out.println("Digite o Valor do veículo: ");
		this.valorDiaria = input.nextDouble();
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
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valor) {
		this.valorDiaria = valor;
	}
}