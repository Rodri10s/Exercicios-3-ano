package exercicio4;

import java.util.Random;
import java.util.Scanner;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String whatsapp;
	private String login;
	private String senha;
	private Endereco endereco;
	
	public void preencherCliente(){
		Scanner input = new Scanner(System.in);
		Random gerador = new Random();
		
		System.out.println("\n------------------------------------------------------");
		System.out.println("Preencher Dados do Cliente:\n");
		this.id = gerador.nextInt(999);
		System.out.println("Digite o Nome: ");
		this.nome = input.nextLine();
		System.out.println("Digite o Número do CPF: ");
		this.cpf = input.nextLine();
		System.out.println("Digite o Número do Whatsapp: ");
		this.whatsapp = input.nextLine();
		System.out.println("Digite o Login: ");
		this.login = input.nextLine();
		System.out.println("Digite a Senha de acesso: ");
		this.senha = input.nextLine();
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
