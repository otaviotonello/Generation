package PooExercicios;

public class Cliente {

	//ATRIBUTOS
	
	private int cadastro;
	private String sexo;
	private boolean desconto;
	
	//METODOS
	
	public Cliente() {
		cadastro=0000;
	}
	
	public void desconto(boolean desconto) {
		if (desconto==true) {
			System.out.println("Parab�ns, voc� ganhou um pr�mio de desconto!");
		} else {
			System.out.println("Infelizmente, voc� n�o ganhou o pr�mio");
		}
	}
	
	public void sexo(String sexo) {
		if(sexo=="m") {
			System.out.println("Voc� tem 5% de desconto na �rea masculina!");
		} else if (sexo=="f") {
			System.out.println("Voc� tem 5% de desconto na �rea feminina!");
		}
	}
	
	
	//GETTERS E SETTERS
	
	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isDesconto() {
		return desconto;
	}

	public void setDesconto(boolean desconto) {
		this.desconto = desconto;
	}
	
	
}
