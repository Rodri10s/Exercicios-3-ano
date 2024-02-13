package exercicio5;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno() {
		super();
	}

	public Aluno(int id, String nome, String rg, String cpf, String sexo, String matricula) {
		super(id, nome, rg, cpf, sexo);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
