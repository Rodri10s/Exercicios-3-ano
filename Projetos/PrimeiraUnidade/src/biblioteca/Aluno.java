package biblioteca;

import java.util.Scanner;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno() {
		dadosAluno();
	}
	
	public void dadosAluno() {
		System.out.println("Dados do aluno: ");
		
		Scanner input = new Scanner(System.in);
		
		Pessoa pes1 = new Pessoa();

		System.out.println("\nId: ");
		pes1.setId(input.nextInt());
		input.nextLine();
		System.out.println("Nome: ");
		pes1.setNome(input.nextLine());
		System.out.println("CPF: ");
		pes1.setCpf(input.nextLine());
		System.out.println("RG: ");
		pes1.setRg(input.nextLine());
		System.out.println("Sexo: ");
		pes1.setSexo(input.nextLine());
		System.out.println("Salário: ");
		pes1.setSalario(input.nextDouble());
		input.nextLine();
		System.out.println("Matrícula: ");
		setMatricula(input.nextLine());
	}
	
	public void imprimirTudo() {
		Pessoa pes2 = new Pessoa();
		pes2.imprimirTudo();
		
		System.out.println("Matrícula: " + getMatricula());
	}

	public Aluno(int id, String nome, String cpf, String rg, String sexo, double salario, String matricula) {
		super(id, nome, cpf, rg, sexo, salario);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
