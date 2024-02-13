package lista;

import java.sql.Date;
import java.util.List;

public class Emprestimo {
	private Date data;
	private Date dataDevolucao;
	private List <Livro> livro;
	private Funcionario funcionario;
	private Aluno aluno;
	
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
