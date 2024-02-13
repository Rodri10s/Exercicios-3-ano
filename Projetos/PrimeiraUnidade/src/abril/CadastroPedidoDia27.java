package abril;

public class CadastroPedidoDia27 {
	
	public static void main(String[] args) {
		
		ProdutoDia27 pro1 = new ProdutoDia27();
		
		pro1.id = 1;
		pro1.nome = "Arroz";
		pro1.valor = 4.5;
		pro1.descricao = "nenhuma";
		pro1.codigoBarras = "342342342";
		
		PedidoDia27 ped1 = new PedidoDia27();
		
		ped1.id = 40;
		ped1.enderecoEntrega = "Rua barcelona, Nº 360";
		ped1.tempoMedioEntrega = 3;
		ped1.valorTotal = 243;
		ped1.item = pro1;
		
		System.out.println("=====CUPOM FISCAL=====");
		System.out.println("Itens");
		System.out.println("Nome Produto: " + ped1.item.nome);
		System.out.println("Valor Produto: " + ped1.item.valor);
		System.out.println("Descrição Produto: " + ped1.item.descricao);
		System.out.println("Código de Barras do Produto: " + ped1.item.codigoBarras);
		System.out.println("-----------------");
		System.out.println("Endereço de Entrega: " + ped1.enderecoEntrega);
		System.out.println("Valor Total: " + ped1.valorTotal);
		System.out.println("-----------------");
		
	}

}
