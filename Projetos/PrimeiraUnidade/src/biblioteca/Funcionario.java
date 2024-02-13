package biblioteca;

import java.sql.Date;
import java.util.Scanner;

public class Funcionario extends Pessoa {
	
	private String funcao;
	private Date dataAdmissao;
	
	public Funcionario() {
		dadosFuncionario();
	}
	
	public void dadosFuncionario() {
		System.out.print("\nDados do Funcionário: \n");
		
		Pessoa pes3 = new Pessoa();
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nId: ");
		pes3.setId(input.nextInt());
		input.nextLine();
		System.out.println("Nome: ");
		pes3.setNome(input.nextLine());
		System.out.println("CPF: ");
		pes3.setCpf(input.nextLine());
		System.out.println("RG: ");
		pes3.setRg(input.nextLine());
		System.out.println("Sexo: ");
		pes3.setSexo(input.nextLine());
		System.out.println("Salário: ");
		pes3.setSalario(input.nextDouble());
		input.nextLine();

		System.out.println("Função: ");
		this.funcao = input.nextLine();
		this.dataAdmissao = new Date(0);
	}
	
	public void imprimitTudo() {
		System.out.println("Dados do Funcionário: \n");
		Pessoa pes4 = new Pessoa();
		pes4.imprimirTudo();
		
		System.out.println("Função: " + getFuncao());
		System.out.println("Data de Admição: " + getDataAdmissao());
	}

	public Funcionario(int id, String nome, String cpf, String rg, String sexo, double salario, String funcao,
			Date dataAdmissao) {
		super(id, nome, cpf, rg, sexo, salario);
		this.funcao = funcao;
		this.dataAdmissao = dataAdmissao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
}
