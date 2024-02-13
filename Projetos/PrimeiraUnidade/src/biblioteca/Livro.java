package biblioteca;

import java.util.Scanner;

public class Livro {
	private String nome;
	private String editora;
	private String edicao;
	private String volume;
	private String autor;
	
	public Livro() {
		dadosLivro();
	}
	
	public void dadosLivro() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dados do Livro: ");
		
		System.out.println("\nNome do Livro: ");
		this.nome = input.nextLine();
		System.out.println("Nome da Editora: ");
		this.editora = input.nextLine();
		System.out.println("Edição do Livro: ");
		this.edicao = input.nextLine();
		System.out.println("Volume do Livro: ");
		this.volume = input.nextLine();
		System.out.println("Autor do Livro: ");
		this.autor = input.nextLine();
	}
	
	public void imprimirTudo() {
		System.out.println("Nome do Livro: " + getNome());
		System.out.println("Nome da Editora: " + getEditora());
		System.out.println("Edição do Livro: " + getEdicao());
		System.out.println("Volume do Livro: " + getVolume());
		System.out.println("Autor do Livro: " + getAutor());
	}
	
	public Livro(String nome, String editora, String edicao, String volume, String autor) {
		super();
		this.nome = nome;
		this.editora = editora;
		this.edicao = edicao;
		this.volume = volume;
		this.autor = autor;
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

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
