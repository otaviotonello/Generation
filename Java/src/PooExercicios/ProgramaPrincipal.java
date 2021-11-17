package PooExercicios;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		Preguica p = new Preguica();
		Cavalo k = new Cavalo();
		
		System.out.println("Cachorro:");
		c.acao();
		c.emitirSom();
		System.out.println("----------------------------------------------------------");
		
		
		System.out.println("Preguiça:");
		p.acao();
		p.emitirSom();
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Cavalo:");
		k.acao();
		k.emitirSom();
		System.out.println("----------------------------------------------------------");
		
	}

}
