package PooExercicios;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		Preguica p = new Preguica();
		Cavalo k = new Cavalo();
		
		c.setNome("Rex");
		c.setIdade(3);
		System.out.println("Cachorro: " + c.getNome() + " | Idade: " + c.getIdade());
		c.acao();
		c.emitirSom();
		System.out.println("----------------------------------------------------------");
		
		p.setNome("Preguicinha");
		p.setIdade(12);
		System.out.println("Preguiça: " + p.getNome() + " | Idade: " + p.getIdade());
		p.acao();
		p.emitirSom();
		System.out.println("----------------------------------------------------------");
		
		k.setNome("Afonso");
		k.setIdade(23);
		System.out.println("Cavalo: " + k.getNome() + " | Idade: " + k.getIdade());
		k.acao();
		k.emitirSom();
		System.out.println("----------------------------------------------------------");
		
	}

}
