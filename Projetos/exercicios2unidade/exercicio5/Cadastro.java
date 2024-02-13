package exercicio5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Cadastro {
	public static void main(String[] args) throws ParseException {
		
		Livro liv1 = new Livro();
		liv1.setId(111);
		liv1.setAutor("Collen Hoover");
		liv1.setNome("Verity");
		liv1.setEdicao("1ª edição");
		liv1.setEditora("Shereks");
		liv1.setVolume("Único");
		
		Livro liv2 = new Livro();
		liv2.setId(222);
		liv2.setAutor("Franz Kafka");
		liv2.setNome("A Metamorfose");
		liv2.setEdicao("1ª edição");
		liv2.setEditora("Principis");
		liv2.setVolume("Único");
		
		Livro liv3 = new Livro();
		liv3.setId(222);
		liv3.setAutor("Robert Kirkman");
		liv3.setNome("The Walking Dead - A Ascensão do Governador");
		liv3.setEdicao("1ª edição");
		liv3.setEditora("Editorial Record");
		liv3.setVolume("Um");
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Funcionario func = new Funcionario(123, "Rafaela", "75.123.334", "123.456.789-23", "Feminino", 1320, "Bibliotecária", formato.parse("17/08/2010"));
		Aluno alun = new Aluno(456, "Ramon Gustavo", "25.175.555", "345.225.780-00", "Masculino", "202010070039");
		
		Emprestimo emp = new Emprestimo();
		emp.setId(111);
		emp.setLivros(Arrays.asList(liv1, liv2, liv3));
		emp.setFuncionario(func);
		emp.setAluno(alun);
		emp.setData(formato.parse("09/06/2023"));
		emp.setDataDevolucao(formato.parse("25/06/2023"));
		
		System.out.println("=============== Empréstimo ===============");
		System.out.println("Id do Emprestimo: "+ emp.getId());
		System.out.println("Funcionário: "+ emp.getFuncionario().getNome());
		System.out.printf("\nAluno: %s    Matrícula: %s\n", emp.getAluno().getNome(), emp.getAluno().getMatricula());
		System.out.println("Data de Empréstimo: "+formato.format(emp.getData()));
		System.out.println("Data de Devolução: "+formato.format(emp.getDataDevolucao()));
		System.out.println("------------------------------------------");
		System.out.println("Livros Emprestados:");
		
		for(int i = 0; i < emp.getLivros().size(); i++) {
			System.out.println("\nId do Livro: " +emp.getLivros().get(i).getId());
			System.out.println("Autor do Livro: " +emp.getLivros().get(i).getAutor());
			System.out.println("Nome do Livro: " +emp.getLivros().get(i).getNome());
			System.out.println("Edição do Livro: " +emp.getLivros().get(i).getEdicao());
			System.out.println("Editora do Livro: " +emp.getLivros().get(i).getEditora());
			System.out.println("Volume do Livro: " +emp.getLivros().get(i).getVolume());
		}
		System.out.println("==========================================");
	}

}
