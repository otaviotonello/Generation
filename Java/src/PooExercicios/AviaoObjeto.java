package PooExercicios;

import java.util.Scanner;

public class AviaoObjeto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Aviao p1 = new Aviao();

		System.out.println("Digite quantos passageiros v�o: ");
		p1.setPassageiros(in.nextInt());
		System.out.println("Digite quantos tripulantes v�o: ");
		p1.setTripulantes(in.nextInt());
		System.out.println("Digite a companhia(gol/tam): ");
		p1.setCompanhia(in.next());
		
		
		System.out.println("O total de pessoas no avi�o � " + p1.totalPessoas(p1.getPassageiros(), p1.getTripulantes()) + 
				" pessoas.");
		System.out.println("Ir� viajar no avi�o da: " + p1.empresa(p1.getCompanhia()));
		
		in.close();
	}

}
