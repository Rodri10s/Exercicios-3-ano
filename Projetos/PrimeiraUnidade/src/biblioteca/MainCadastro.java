//Projeto Evolutivo

package biblioteca;

import java.util.ArrayList;

public class MainCadastro {
	public static void main(String[] args) {
		
		Emprestimo emp = new Emprestimo();
		
		ArrayList<Livro> listaDeLivros = new ArrayList<>();
		Livro liv1 = new Livro();
		listaDeLivros.add(0, liv1);
		
		emp.imprimirDadosEmprestimo();
	}//Main
}//MainCadastro
