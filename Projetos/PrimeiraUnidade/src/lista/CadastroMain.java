package lista;

import java.util.ArrayList;

public class CadastroMain {
	public static void main(String[] args) {
		ArrayList<Livro> list = new ArrayList<>();
		
		Livro liv1 = new Livro();
		liv1.setNome("Programando Lista");
		liv1.setAutor("Ramon");
		liv1.setEdicao("1ª edição");
		liv1.setEditora("Petrocity");
		liv1.setVolume("1º volume");
		
		Livro liv2 = new Livro();
		liv2.setNome("Listinha Marota");
		liv2.setAutor("Ramon");
		liv2.setEdicao("2ª edição");
		liv2.setEditora("15 pra dois");
		liv2.setVolume("2º volume");
		
		Livro liv3 = new Livro();
		liv3.setNome("Programando em Java");
		liv3.setAutor("Ramon");
		liv3.setEdicao("3ª edição");
		liv3.setEditora("60 pra meio");
		liv3.setVolume("3º volume");
		
		list.add(0, liv1);
		list.add(1, liv2);
		list.add(2, liv3);
		
		Emprestimo emp = new Emprestimo();
		emp.setLivro(list);
		
		for(int i=0; i< list.size(); i++) {
		
		System.out.println("Livro "+(i+1)+":");
		System.out.println("Nome do Livro: "+emp.getLivro().get(i).getNome());
		System.out.println("Autor do Livro: "+emp.getLivro().get(i).getAutor());
		System.out.println("Edição do Livro: "+emp.getLivro().get(i).getEdicao());
		System.out.println("Editora do Livro: "+emp.getLivro().get(i).getEditora());
		System.out.println("Volume do Livro: "+emp.getLivro().get(i).getVolume());
		
			if(i>=0) {
				System.out.println();
			}
		}
		
		//For Eache
		int i = 1;
		for(Livro foreach : emp.getLivro()) {
			
			System.out.println("Livro "+ (i++) +":");
			System.out.println("Nome do Livro: "+foreach.getNome());
			System.out.println("Autor do Livro: "+foreach.getAutor());
			System.out.println("Edição do Livro: "+foreach.getEdicao());
			System.out.println("Editora do Livro: "+foreach.getEditora());
			System.out.println("Volume do Livro: "+foreach.getVolume());
			System.out.println();
		}
	}
}
