package Introducao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		double custoFab, custoCons, valorDist, valorImp;
		double percDist = 28, percImp = 45;
		
		Scanner in = new Scanner(System.in);

		System.out.println("Informe o custo de fábrica: ");
		custoFab = in.nextDouble();

		valorDist = custoFab + (custoFab*percDist / 100);
		valorImp = custoFab + (custoFab*percImp / 100);

		custoCons = custoFab + valorDist + valorImp;

		System.out.println("O custo do consumidor é: " + custoCons);
		
		in.close();
	}

}
