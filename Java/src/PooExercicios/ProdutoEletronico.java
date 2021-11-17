package PooExercicios;

public class ProdutoEletronico {

	//ATRIBUTOS
	
	private String nome;
	private int quantidade, preco;
	private boolean autofalante, bluetooth;
	
	//METODOS
	
	public void tocar() {
		if(autofalante==true) {
			System.out.println("Emitindo som");
		} else {
			System.out.println("Este aparelho não contém som");
		}
	}
	
	public int precoTotal(int quantidade, int preco) {
		int soma = quantidade * preco;
		System.out.println("Valor total: " + soma);
		return soma;
	}
	
	public void compartilhar() {
		if(bluetooth==true) {
			System.out.println("Compartilhando dados...");
		} else {
			System.out.println("Não compartilha dados.");
		}
	}

	public void nome() {
		System.out.println("Seu produto é um " + nome);
	}
	
	
	//GETTERS E SETTERS
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public boolean isAutofalante() {
		return autofalante;
	}

	public void setAutofalante(boolean autofalante) {
		this.autofalante = autofalante;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	
	
	
}
