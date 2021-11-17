package PooExercicios;

public class ProdutoEletronicoObjeto {

	public static void main(String[] args) {
		ProdutoEletronico a = new ProdutoEletronico();
		
		a.setNome("iPhone 17");
		a.setAutofalante(true);
		a.setBluetooth(false);
		a.setPreco(12000);
		a.setQuantidade(4);
		
		a.nome();
		a.tocar();
		a.precoTotal(a.getPreco(), a.getQuantidade());
	}
}
