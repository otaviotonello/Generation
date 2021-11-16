package VetorMatriz;

import java.util.Scanner;

public class Ex1VetMat {

	public static void main(String[] args) {
		// Faça um programa onde o usuário entre com 4 notas num vetor chamado média, e o programa mostre a média.

		Scanner in = new Scanner(System.in);
		
		double[] media = new double[4];
		double mediaFinal=0, soma=0;
		
		for(int i=0; i<4; i++) {
			System.out.println("Digite as notas: ");
			media[i] = in.nextDouble();
			soma = soma + media[i];
		}
		mediaFinal = soma/4;
		
		System.out.println("A média do aluno é: " + mediaFinal);
		in.close();
	}

}
