package VetorMatriz;

import java.util.Scanner;

public class Ex1VetMat {

	public static void main(String[] args) {
		// Fa�a um programa onde o usu�rio entre com 4 notas num vetor chamado m�dia, e o programa mostre a m�dia.

		Scanner in = new Scanner(System.in);
		
		double[] media = new double[4];
		double mediaFinal=0, soma=0;
		
		for(int i=0; i<4; i++) {
			System.out.println("Digite as notas: ");
			media[i] = in.nextDouble();
			soma = soma + media[i];
		}
		mediaFinal = soma/4;
		
		System.out.println("A m�dia do aluno �: " + mediaFinal);
		in.close();
	}

}
