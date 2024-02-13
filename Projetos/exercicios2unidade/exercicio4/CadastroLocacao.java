package exercicio4;

import java.util.Arrays;

public class CadastroLocacao {
	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.preencherCliente();
		
		Endereco end = new Endereco();
		end.preencherEndereco();
		cli.setEndereco(end);
		
		Locacao loc = new Locacao();
		loc.preencherLocacao();
		loc.setCliente(cli);
		
		Veiculo vei1 = new Veiculo();
		vei1.preencherVeiculo();
		
		Veiculo vei2 = new Veiculo();
		vei2.preencherVeiculo();
		
		Veiculo vei3 = new Veiculo();
		vei3.preencherVeiculo();
		
		loc.setVeiculosLocados(Arrays.asList(vei1, vei2, vei3));
		
		loc.imprimirTudo();
		
	}

}
