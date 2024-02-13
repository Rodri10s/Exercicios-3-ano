package maio;

import java.util.ArrayList;

public class AulaDeListas {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList();
		lista.add("Tristeza");
		lista.add("Alegria");
		lista.add("Saúde");
		lista.add("Ódio");
		lista.add("Doença == Marques");
		
		//Forma Simples
		System.out.println(lista);

		//Forma remover
		lista.remove(1);
		System.out.println(lista);
		
		//Iterar a lista forma tradicional
		for(int i=0; i < lista.size(); i++) {
			System.out.println(i+1 + " - " + lista.get(i));
		} 
		
		//Iterar a lista de forma q não sei o nome
		int cont = 0;
		for(String valor : lista) {
			cont++;
			System.out.println(cont + " - " + valor);
		}
		
	}//main
}//AulaDeListas
