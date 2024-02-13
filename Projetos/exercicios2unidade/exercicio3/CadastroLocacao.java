package exercicio3;

import java.text.DecimalFormat;
import java.util.Arrays;

public class CadastroLocacao {
	public static void main(String[] args) {
		DecimalFormat formato = new DecimalFormat();
		formato.applyPattern("R$ #,##0.00");

		System.out.println("\n------------------------------------------------------");
		System.out.println("Preencher dados da Locação:\n");
		Locacao loc = new Locacao();
		loc.preencherLocacao();

		System.out.println("\n------------------------------------------------------");
		System.out.println("Preencher dados do Primeiro veículo locado:\n");
		Veiculo vei1 = new Veiculo();
		vei1.preencherVeiculo();
		System.out.println("\n------------------------------------------------------");
		System.out.println("Preencher dados do Segundo veículo locado:\n");
		Veiculo vei2 = new Veiculo();
		vei2.preencherVeiculo();
		System.out.println("\n------------------------------------------------------");
		System.out.println("Preencher dados do Terceiro veículo locado:\n");
		Veiculo vei3 = new Veiculo();
		vei3.preencherVeiculo();
		
		loc.setVeiculosLocados(Arrays.asList(vei1, vei2, vei3));

		// Cupom Fiscal
		System.out.println("\n\n==================== CUPOM FISCAL ====================");
		System.out.printf("Id da Locação: %d", loc.getId());
		System.out.printf("\nStatus: " + loc.getStatus());
		System.out.printf("\nQuantidade de Diárias: " + loc.getQtdDiarias());
		System.out.println("\n======================================================");
		
		for (int i = 0; i < loc.getVeiculosLocados().size(); i++) {
			System.out.printf("\nId do %dº Veículo: %d", i+1, loc.getVeiculosLocados().get(i).getId());
			System.out.printf("\nModelo: "+ loc.getVeiculosLocados().get(i).getModelo());
			System.out.printf("\nValor: "+ formato.format(loc.getVeiculosLocados().get(i).getValorDiaria()));
			System.out.println();
		}
		
		loc.setValorTotal();
		loc.setValorDesconto();
		loc.setValorPagar();
		
		System.out.println("\n======================================================");
		System.out.printf("\nValor Total: " + formato.format(loc.getValorTotal()));
		System.out.println("\nDesconto de 5%: " + formato.format(loc.getValorDesconto()));
		System.out.println("\nValor à pagar: " + formato.format(loc.getValorPagar()));
		System.out.println("\n======================================================");
	}

}
