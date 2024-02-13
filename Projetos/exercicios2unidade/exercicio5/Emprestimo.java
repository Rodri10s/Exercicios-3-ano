package exercicio5;

import java.util.Date;
import java.util.List;

public class Emprestimo {
	private int id;
	private Date data;
	private Date dataDevolucao;
	private List <Livro> livros;
	private Aluno aluno;
	private Funcionario funcionario;
	
	public Emprestimo() {
		super();
	}

	public Emprestimo(int id, Date data, Date dataDevolucao, List<Livro> livros, Aluno aluno, Funcionario funcionario) {
		super();
		this.id = id;
		this.data = data;
		this.dataDevolucao = dataDevolucao;
		this.livros = livros;
		this.aluno = aluno;
		this.funcionario = funcionario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
