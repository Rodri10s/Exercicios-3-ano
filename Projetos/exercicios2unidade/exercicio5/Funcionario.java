package exercicio5;

import java.util.Date;

public class Funcionario extends Pessoa {
	private double salario;
	private String funcao;
	private Date dataAdmissao;
	
	public Funcionario() {
		super();
	}


	public Funcionario(int id, String nome, String rg, String cpf, String sexo, double salario, String funcao,
			Date dataAdmissao) {
		super(id, nome, rg, cpf, sexo);
		this.salario = salario;
		this.funcao = funcao;
		this.dataAdmissao = dataAdmissao;
	}



	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
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
