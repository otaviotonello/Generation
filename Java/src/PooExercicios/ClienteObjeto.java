package PooExercicios;

public class ClienteObjeto {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();

		c1.setCadastro(0001);
		c1.setSexo("f");
		
		c2.setCadastro(0002);
		c2.setSexo("m");
		
		//Testando Constructor
		c3.getClass();
		c3.setSexo("f");
		
		System.out.println("Cliente " + c1.getCadastro() + " | Sexo: " + c1.getSexo());
		c1.desconto(true);
		c1.sexo(c1.getSexo());
		
		System.out.println("\nCliente " + c2.getCadastro() + " | Sexo: " + c2.getSexo());
		c2.desconto(false);
		c2.sexo(c2.getSexo());
		
		System.out.println("\nCliente " + c3.getCadastro() + " | Sexo: " + c3.getSexo());
		c3.desconto(false);
		c3.sexo(c3.getSexo());
	}
}
