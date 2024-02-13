package exercicio5;

public class Livro {
	private int id;
	private String nome;
	private String editora;
	private String volume;
	private String edicao;
	private String autor;
	
	public Livro() {
		super();
	}

	public Livro(int id, String nome, String editora, String volume, String edicao, String autor) {
		super();
		this.id = id;
		this.nome = nome;
		this.editora = editora;
		this.volume = volume;
		this.edicao = edicao;
		this.autor = autor;
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

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
