package biblioteca;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
	private Date data;
	private Date dataDevolucao;
	private List <Livro> livro;
	private Funcionario funcionario;
	private Aluno aluno;
	
	public Emprestimo() {
		preencherDadosEmprestimo();
	}
	
	public void preencherDadosEmprestimo() {
		this.data = new Date(0);
		this.dataDevolucao = new Date(0);
		
		Funcionario func = new Funcionario();
		this.funcionario = func;
		
		Aluno alu = new Aluno();
		this.aluno = alu;
	}
	
	public void imprimirDadosEmprestimo() {
		System.out.println("\nData do Empréstimo: " + getData());
		System.out.println("Data de Devolução: " + getDataDevolucao());
		
		System.out.println("\nNome do livro: " + getLivro().get(0).getNome());
		System.out.println("Editora do livro: " + getLivro().get(0).getEditora());
		System.out.println("Edição do livro: " + getLivro().get(0).getEdicao());
		System.out.println("Volume do livro: " + getLivro().get(0).getVolume());
		System.out.println("Autor do livro: " + getLivro().get(0).getAutor());
		
		System.out.println("\nId do Funcionário: " + getFuncionario().getId());
		System.out.println("Nome do Funcionário: " + getFuncionario().getNome());
		System.out.println("CPF do Funcionário: " + getFuncionario().getCpf());
		System.out.println("RG do Funcionário: " + getFuncionario().getRg());
		System.out.println("Sexo do Funcionário: " + getFuncionario().getSexo());
		System.out.println("Salário do Funcionário: " + getFuncionario().getSalario());
		System.out.println("Função do Funcionário: " + getFuncionario().getFuncao());
		System.out.println("Data de Admissão do Funcionário: " + getFuncionario().getDataAdmissao());
		
		System.out.println("\nID do Aluno: " + getAluno().getId());
		System.out.println("Nome do Aluno: " + getAluno().getNome());
		System.out.println("CPF do Aluno: " + getAluno().getCpf());
		System.out.println("RG do Aluno: " + getAluno().getRg());
		System.out.println("Sexo do Aluno: " + getAluno().getSexo());
		System.out.println("Salário do Aluno: " + getAluno().getSalario());
		System.out.println("Matrícula do Aluno: " + getAluno().getMatricula());
	}
	
	public Emprestimo(Date data, Date dataDevolucao, List<Livro> livro, Funcionario funcionario, Aluno aluno) {
		super();
		this.data = data;
		this.dataDevolucao = dataDevolucao;
		this.livro = livro;
		this.funcionario = funcionario;
		this.aluno = aluno;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
}
