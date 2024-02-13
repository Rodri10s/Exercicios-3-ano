package biblioteca;

import java.util.Scanner;

public class Pessoa {
	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private double salario;

	public Pessoa() {
		
	}

	public void preencherDadosPessoa() {
		Scanner input = new Scanner(System.in);

		System.out.println("\nId: ");
		this.id = input.nextInt();
		input.nextLine();
		System.out.println("Nome: ");
		this.nome = input.nextLine();
		System.out.println("CPF: ");
		this.cpf = input.nextLine();
		System.out.println("RG: ");
		this.rg = input.nextLine();
		System.out.println("Sexo: ");
		this.sexo = input.nextLine();
		System.out.println("Salário: ");
		this.salario = input.nextDouble();
	}
	
	public void imprimirTudo() {
		System.out.println("Id: " + getId());
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("RG: " + getRg());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Salário: " + getSalario());
	}

	public Pessoa(int id, String nome, String cpf, String rg, String sexo, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.salario = salario;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
