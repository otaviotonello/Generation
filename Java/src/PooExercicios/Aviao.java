package PooExercicios;

public class Aviao {

	// ATRIBUTOS
	
	private int passageiros;
	private String companhia;
	private int tripulantes;
	
	// METODOS
	
	public int totalPessoas(int passageiros, int tripulantes) {
		int soma = passageiros + tripulantes;
		return soma;
	}
	
	public String empresa(String companhia) {
		
		if(companhia=="gol") {
			System.out.println("Você irá voar de GOL!");
		} else if (companhia=="tam") {
			System.out.println("Você irá voar de TAM!");
		}
		return companhia;
	}

	// GETTERS E SETTERS
	
	
	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public int getTripulantes() {
		return tripulantes;
	}

	public void setTripulantes(int tripulantes) {
		this.tripulantes = tripulantes;
	}
	
}
