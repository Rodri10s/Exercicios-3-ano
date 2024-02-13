package exercicio4;

import java.util.Scanner;
import java.util.Random;

public class Endereco {
	private int id;
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public void preencherEndereco(){
		Scanner input = new Scanner(System.in);
		Random gerador = new Random();
		
		System.out.println("\n------------------------------------------------------");
		System.out.println("Preencher Endereço:\n");
		this.id = gerador.nextInt(999);
		System.out.println("Digite a Rua: ");
		this.rua = input.nextLine();
		System.out.println("Digite o Número da residência: ");
		this.numero = input.nextLine();
		System.out.println("Digite o Bairro: ");
		this.bairro = input.nextLine();
		System.out.println("Digite a Cidade: ");
		this.cidade = input.nextLine();
		System.out.println("Digite o Estado: ");
		this.estado = input.nextLine();
		System.out.println("Digite o CEP da cidade: ");
		this.cep = input.nextLine();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
