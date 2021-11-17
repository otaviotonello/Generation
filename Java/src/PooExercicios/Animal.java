package PooExercicios;

public abstract class Animal {

	//ATRIBUTOS
	
	private String nome;
	private double idade;
	
	//METODOS
	
	public void emitirSom() {
		System.out.println("Emitindo som...");
	}
	
	public void acao(){
		System.out.println("Fazendo ação...");
	}

	
	//GETTERS E SETTERS
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}
	
	
}
